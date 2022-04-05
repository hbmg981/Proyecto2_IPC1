package ipc_proyecto2_201709051;

public class Sobres implements Listas<Sobre> {

    Sobre head = new Sobre(), special = new Sobre();
    
    Sobres(){
        special.ant = head;
        special.next = head;
        head.next = special;
        head.ant = special;
        special.size = -1;
    }

    @Override
    public void add(Sobre nuevo) {
        Sobre n = head;
        while (!n.next.equals(special)) {
            n = n.next;
        }
        special.ant = nuevo;
        n.next = nuevo;
        nuevo.ant = n;
        nuevo.next = special;
    }

    public void clean(){
        Sobre n = head;
        for (int i = 0; i < size(); i++) {
            if(n.count < 4){
                Estampa nueva = n.estampas.head;
                for (int j = 0; j < n.count; j++) {
                    Estampa p = new Estampa(nueva.NombreJugador, 
                            nueva.IDEquipo, nueva.Rareza, nueva.Ruta);
                    nueva = nueva.next;
                    this.special.add(p);
                }
                delete2(n);
            }
            n = n.next;
        }
    }
    
    @Override
    public void show() {
        Sobre n = head;
        while (!n.next.equals(special)) {
            System.out.println("");
            n = n.next;
        }
        System.out.println("");
        
        System.out.println("El tamaño es "+size());
    }

    @Override
    public void addAt(Sobre nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAtStart(Sobre nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void delete2(Sobre d){
        Sobre n = head;
        while (!n.equals(d)) {
            n = n.next;
        }
        if (n.equals(d)) {
            if (!n.ant.equals(special)) {
                n.ant.next = n.next;
            } else {
                head = n.next;
            }
            if (!n.next.equals(special)) {
                n.next.ant = n.ant;
            } else {
                special.ant = n.ant;
            }
        }
    }
    
    @Override
    public void delete(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sobre get(int Index) {
        Sobre h = this.head;
        for (int i = 0; i < Index; i++) {
            if(h.next.equals(special)) return null;
            h = h.next;
        }
        return h;
    }

    @Override
    public Sobre find(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        Sobre n = this.head;
        int count = 1;
        while (!n.next.equals(special)) {
            count++;
            n = n.next;
        }
        return count;
    }

    @Override
    public void deleteAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

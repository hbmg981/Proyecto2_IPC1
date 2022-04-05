package ipc_proyecto2_201709051;

public class Estampas implements Listas<Estampa> {

    static Estampa head, cola;

    @Override
    public void add(Estampa nuevo) {
        if (head == null) {
            this.head = nuevo;
            this.cola = nuevo;
        } else {
            Estampa n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = nuevo;
            this.cola = nuevo;
            nuevo.ant = n;
        }
    }

    @Override
    public void show() {
        Estampa n = head;
        while (n.next != null) {
            System.out.print(n.NombreJugador);
            n = n.next;
        }
        System.out.print(n.NombreJugador);
    }

    @Override
    public void addAt(Estampa nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAtStart(Estampa nuevo) {
        Estampa n = this.head;
        nuevo.next = n;
        this.head = nuevo;
    }

    @Override
    public void delete(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void deleteEstampa(String ID){
        if(this.head.NombreJugador.equals(ID)){
            this.head = this.head.next;
            return;
        }
        Estampa n = this.head;
        while (!ID.equals(n.next.NombreJugador)) {
            n = n.next;
        }
        try{
            if (ID.equals(n.NombreJugador)) {
                n.next = n.next.next;
            }
        }catch(NullPointerException e){
            n.next = null;
        }
    }

    @Override
    public Estampa get(int Index) {
        Estampa n = this.head;
        for (int i = 0; i < Index; i++) {
            n = n.next;
        }
        return n;
    }

    @Override
    public Estampa find(String IDJugador) {
        Estampa n = this.head;
        while (!IDJugador.equals(n.NombreJugador)) {
            n = n.next;
        }
        if (IDJugador.equals(n.NombreJugador)) {
            return n;
        } else {
            return null;
        }
    }


    @Override
    public int size() {
        Estampa n = this.head;
        int count = 1;
        while (n.next != null) {
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

package ipc_proyecto2_201709051;

public class Equipos implements Listas<Equipo> {

    Equipo head, cola;

    @Override
    public void add(Equipo nuevo) {
        if (head == null) {
            this.head = nuevo;
            this.cola = nuevo;
        } else {
            Equipo n = head;
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
        Equipo n = head;
        while (n.next != null) {
            System.out.print(n.name + "     " + n.ID +"     "+ n.wins+"    "+ n.date+ "\n");
            n = n.next;
        }
        System.out.print(n.name + "       " + n.ID +"      "+ n.wins+"      "+ n.date+ "\n");
        System.out.println("");
        System.out.println("El primer equipo es: " + head.name + " " + head.ID);
        System.out.println("El ultimo equipo es: " + cola.name + " " + cola.ID);
    }

    @Override
    public void addAt(Equipo nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAtStart(Equipo nuevo) {
        Equipo n = this.head;
        n.ant = nuevo;
        nuevo.next = n;
        this.head = nuevo;
    }

    @Override
    public void delete(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public Equipo find(String ID) {
        Equipo n = head;
        while (!n.ID.equals(ID)) {
            n = n.next;
        }
        if(n.ID.equals(ID)) return n;
        else return null;
    }

    @Override
    public Equipo get(int index) {
        Equipo n = this.head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n;
    }

    @Override
    public int size() {
        int size = 0;
        Equipo n = head;
        while (n != null && n.next != null) {
            n = n.next;
            size++;
        }
        size++;
        return size;
    }

    @Override
    public void deleteAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void resetTheCount(){
        Equipo n = head;
        while (n.next != null) {
            n = n.next;
            n.count = 0;
        }
        n.count=0;
    }

}

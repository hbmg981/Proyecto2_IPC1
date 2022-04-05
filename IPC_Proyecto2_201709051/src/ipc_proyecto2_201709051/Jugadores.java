package ipc_proyecto2_201709051;

public class Jugadores implements Listas<Jugador> {

    Jugador head, cola;
    String team;

    Jugadores() {
       // String ID = "";
       // this.team = ID;
    }

    @Override
    public void add(Jugador nuevo) {
        if (head == null) {
            this.head = nuevo;
            this.cola = nuevo;
        } else {
            Jugador n = head;
            while (n.next != null) {
                n = n.next;
            }
            nuevo.team = this.team;
            n.next = nuevo;
            this.cola = nuevo;
            nuevo.ant = n;
        }
    }

    @Override
    public void show() {
        Jugador n = head;
        while (n.next != null) {
            System.out.print(" " +n.name + " " + n.pos + " " +n.year+ " " +n.height+ " " +n.weight+ " " +n.team+ " " +n.number+ " " +n.type+ "\n");
            n = n.next;
        }
        System.out.print(" " +n.name + " " + n.pos + " " +n.year+ " " +n.height+ " " +n.weight+ " " +n.team+ " " +n.number+ " " +n.type+ "\n");
        System.out.println("");
        System.out.println("El primero es: " + " " +head.name + " " + head.pos + " " +head.year+ " " +head.height+ " " +head.weight+ " " +head.team+ " " +head.number+ " " +head.type+ "\n");
        System.out.println("La Cola es: " + " " +cola.name + " " + cola.pos + " " +cola.year+ " " +cola.height+ " " +cola.weight+ " " +cola.team+ " " +cola.number+ " " +cola.type+ "\n");
        System.out.println("Es del equipo :" + n.team);
    }

    
    @Override
    public void addAt(Jugador nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAtStart(Jugador nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Jugador get(int index) {
        Jugador n = this.head;
        for (int i = 1; i < index; i++) {
            n = n.next;
        }
        return n;
    }


    @Override
    public Jugador find(String ID) {
        Jugador n = head;
        while (!ID.equals(n.ID)) {
            n = n.next;
        }
        if (ID.equals(n.ID)) {
            return n;
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        int size = 0;
        Jugador n = head;
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


}

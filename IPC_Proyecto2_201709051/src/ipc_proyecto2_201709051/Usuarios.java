package ipc_proyecto2_201709051;

import java.util.Random;

public class Usuarios implements Listas<Usuario> {

    Random ran = new Random();
    Usuario head, cola;

    @Override
    public void add(Usuario nuevo) {
        if (head == null) {
            this.head = nuevo;
            this.cola = nuevo;
        } else {
            Usuario n = head;
            try {
                while (nuevo.Nombre.compareTo(n.Nombre) > 0) {
                    n = n.next;
                }
                if (n.ant == null) {
                    addAtStart(nuevo);
                } else {
                    nuevo.ant = n.ant;
                    n.ant.next = nuevo;
                    nuevo.next = n;
                    n.ant = nuevo;
                }
            } catch (Exception e) {
                this.cola.next = nuevo;
                nuevo.ant = this.cola;
                this.cola = nuevo;
            }
        }
    }
    
    void clean(){
        Usuario n = this.head;
        for (int i = 0; i < size(); i++) {
            n.list.clean();
            n = n.next;
        }
    }

    @Override
    public void show() {
        Usuario n = head;
        while (n.next != null) {
            System.out.println(n.Nombre + " " + n.User);
            n = n.next;
        }
        System.out.println(n.Nombre + " " + n.User);
    }

    @Override
    public void addAt(Usuario nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAtStart(Usuario nuevo) {
        Usuario n = this.head;
        n.ant = nuevo;
        nuevo.next = n;
        this.head = nuevo;
    }

    @Override
    public void delete(String ID) {
        Usuario n = head;
        while (!n.ID.equals(ID)) {
            n = n.next;
        }
        if (n.ID.equals(ID)) {
            if (n.ant != null) {
                n.ant.next = n.next;
            } else {
                head = n.next;
            }
            if (n.next != null) {
                n.next.ant = n.ant;
            } else {
                cola = n.ant;
            }
        }
    }

    @Override
    public Usuario get(int index) {
        Usuario n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n;
    }

    public Usuario getPassword(String Password) {
        Usuario n = head;
        while (!n.Contraseña.equals(Password)) {
            n = n.next;
        }
        if (n.Contraseña.equals(Password)) {
            return n;
        } else {
            return null;
        }
    }

    @Override
    public Usuario find(String ID) {
        Usuario n = head;
        while (!ID.equals(n.User)) {
            n = n.next;
        }
        if (ID.equals(n.User)) {
            return n;
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        int size = 0;
        Usuario n = head;
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

  

    private int indexOf(Usuario i) {
        int count = 0;
        Usuario n = this.head;
        if (n.equals(i)) {
            return count;
        } else {
            while (!n.equals(i)) {
                count++;
                n = n.next;
            }
            return count;
        }
    }

}

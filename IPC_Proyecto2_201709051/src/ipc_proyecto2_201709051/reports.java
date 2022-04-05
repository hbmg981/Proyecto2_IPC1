package ipc_proyecto2_201709051;

public class reports implements Listas<reportNode> {
    reportNode head;

    @Override
    public void add(reportNode nuevo) {
        reportNode n = this.head;
        if(this.head == null){
            this.head = nuevo;
            return;
        }
        while (n.next != null) {
            n = n.next;
        }
        n.next = nuevo;
    }

    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAt(reportNode nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAtStart(reportNode nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public reportNode get(int index) {
        reportNode n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n;
    }

    @Override
    public reportNode find(String name) {
        reportNode n = head;
        while (!name.equals(n.name)) {
            n = n.next;
        }
        if (name.equals(n.name)) {
            return n;
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        int size = 0;
        reportNode n = head;
        while (n != null && n.next != null) {
            n = n.next;
            size++;
        }
        size++;
        return size;
    }

}

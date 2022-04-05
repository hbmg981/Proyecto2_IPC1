package ipc_proyecto2_201709051;

public class Usuario {

    String ID, Nombre, Birth, Contraseña, eMail, User;

    public Usuario(String ID, String Nombre, String Birth, String Contraseña, String eMail, String User) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Birth = Birth;
        this.Contraseña = Contraseña;
        this.eMail = eMail;
        this.User = User;
    }

    Usuario next;
    Usuario ant;
    Sobres list, pegadas;
    int count = 0;

    Estampas getPrintsStuck() {
        return this.pegadas.special.estampas;
    }

    boolean hasThePlayer(String IDJugador) {
        try {
            Estampa player = this.pegadas.special.estampas.find(IDJugador);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    int numberOfStickers() {
        int i = getCount();
        Sobre n = this.list.head;
        while (!n.next.equals(this.list.special)) {
            Estampa h = n.estampas.head;
            while (h.next != null) {
                i++;
                h = h.next;
            }
            i++;
            n = n.next;
        }
        return i;
    }

    Estampas getDifferentStickers() {
        Estampas temp = new Estampas();
        Estampa n = this.list.special.estampas.head;
        while (n.next != null) {
            try {
                Estampa t = temp.find(n.NombreJugador);
            } catch (NullPointerException e) {
                temp.add(new Estampa(n.NombreJugador, n.IDEquipo, n.Rareza, n.Ruta));
            }
            n = n.next;
        }
        try {
            Estampa t = temp.find(n.NombreJugador);
        } catch (NullPointerException e) {
            temp.add(new Estampa(n.NombreJugador, n.IDEquipo, n.Rareza, n.Ruta));
        }
        return temp;
    }

    int numberOfRepeated(Estampa search) {
        int count2 = 0;
        Estampa n = this.list.special.estampas.head;
        while (n.next != null) {
            if (n.NombreJugador.equals(search.NombreJugador)) {
                count2++;
            }
            n = n.next;
        }
        if (n.NombreJugador.equals(search.NombreJugador)) {
            count2++;
        }
        return count2;
    }

    int getCount() {
        return this.pegadas.special.getCount();
    }

    void setCount(int newCount) {
        this.pegadas.special.count = newCount;
    }

    String getName() {
        return this.Nombre;
    }
}

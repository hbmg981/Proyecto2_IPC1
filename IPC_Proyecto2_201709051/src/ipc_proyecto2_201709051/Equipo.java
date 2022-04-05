package ipc_proyecto2_201709051;

public class Equipo {

    Equipo next;
    Equipo ant;
    String ID, wins;
    String name, date;
    Jugadores lista;
    int count = 0;

    Equipo(String name, String ID, String wins, String date) {
        this.name = name;
        this.ID = ID;
        this.date = date;
        this.wins = wins;
        lista = new Jugadores();
    }

    int getCount() {
        return this.count;
    }

}

package ipc_proyecto2_201709051;

public class Estampa {

    String NombreJugador, IDEquipo, Rareza;
    String Ruta;
    Estampa next;
    Estampa ant;

    Estampa(String NombreJugador, String IDEquipo, String Rareza, String Ruta) {
        this.NombreJugador = NombreJugador;
        this.IDEquipo = IDEquipo;
        this.Rareza = Rareza;
        this.Ruta = Ruta;
    }

}

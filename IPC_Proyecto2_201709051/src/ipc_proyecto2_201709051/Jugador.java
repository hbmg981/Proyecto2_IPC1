package ipc_proyecto2_201709051;

public class Jugador {
    Jugador next;
    Jugador ant;
    String ID,year;
    String team;
    String name,pos,number,type;
    String height,weight;
    
    Jugador( String name, String pos,String year, String height, String weight, String team,String number,String type){
        
        this.name = name;
        this.pos = pos;
        this.year = year;
        this.height = height;
        this.weight=weight;
        this.team = team;
        this.number = number;
        this.type = type;
        main.Teams.find(team).lista.add(this);
    }
}

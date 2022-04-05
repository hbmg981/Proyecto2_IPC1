package ipc_proyecto2_201709051;

import java.util.EmptyStackException;
import java.util.Random;

public class Sobre {

    Random n = new Random();
    Sobre next;
    Sobre ant;
    int  count = 0;
    int size = 4 + n.nextInt(5);
    Estampas estampas = new Estampas();
    
    void add(Estampa nuevo) throws EmptyStackException{
        if(count == size) throw new EmptyStackException();
        this.estampas.add(nuevo);
        count++;
    }
    
    int getCount(){
        return this.count;
    }
    
}

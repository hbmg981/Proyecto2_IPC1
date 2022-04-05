package ipc_proyecto2_201709051;

public class reportNode {

    String name;
    reportNode next;
    int succeded = 0, duplicated = 0, invalid = 0;

    reportNode(String name) {
        this.name = name;
    }
    
    int getTotal(){
        int total = this.succeded + this.duplicated +
                this.invalid;
        return total;
    }
}

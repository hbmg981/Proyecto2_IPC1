package ipc_proyecto2_201709051;

public interface Listas<T> {
    void add(T nuevo);
    void show();
    void addAt(T nuevo);
    void addAtStart(T nuevo);
    void delete(String ID);
    void deleteAt(int index);
    T get(int pos);
    T find(String ID);
    int size();
}

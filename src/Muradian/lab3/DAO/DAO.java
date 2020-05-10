package Muradian.lab3.DAO;

import java.util.ArrayList;

public interface DAO<T> {
    void create(T t);
    void delete(T t);
    ArrayList<T> getAll();
    void update(T t, String[] params);
    T get(int id);

}

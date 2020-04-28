package Gress.lab3;
import java.util.List;

public interface DAO <T> {
    //create, delete, findAll, update
    boolean create(T obj);
    boolean delete(T obj);
    List<T> findAll();
    boolean update(T obj);
}

package Gress.lab3;
import java.util.List;

public class DAOUser implements DAO<User> {

    @Override
    public boolean create(User obj) {
        return false;
    }

    @Override
    public boolean delete(User obj) {
        return false;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public boolean update(User obj) {
        return false;
    }
}

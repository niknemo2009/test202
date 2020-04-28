package Gress.lab3;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DAOClient implements DAO<Client> {
    HashSet<User> users = new HashSet<>();

    @Override
    public boolean create(Client obj) {
        boolean result=false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String loginEntered = scan.next();
        if(!users.contains(obj))
        {
                users.add(obj);
                System.out.println("You're signed up successfully.\nAlso you are signed in as " + loginEntered);
                result =  true;
        }
        else {
                System.out.println("Enter your password: ");
                String passwordEntered = scan.next();
                User uFound = User.findUser(users, loginEntered);
                if (uFound.getPassword().compareTo(passwordEntered) == 0) {
                    System.out.println("You're signed in successfully");
                   result =  true;
                } else {
                    System.out.println("Your password is not correct");
                    result =  false;
                }
        }
        return result;
    }

    @Override
    public boolean delete(Client obj) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String loginEntered = scan.next();
        if(users.contains(new User(loginEntered))){
            users.remove(loginEntered);
            return true;
        }
        return false;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }


    public User findAll(String login) {
        User uFound = new User();
        for(User u: users)
            if(u.getLogin().compareTo(login) == 0){
                uFound = u;
                return uFound;
            }
        return uFound;
    }

    @Override
    public boolean update(Client obj) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String loginEntered = scan.next();
        if(users.contains(new User(loginEntered))){

            System.out.println("Enter new password: ");
            String newPassword = scan.next();
            users.add(new Client(loginEntered, newPassword));
        }
        return false;
    }
}

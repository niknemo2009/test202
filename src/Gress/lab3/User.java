package Gress.lab3;
import java.util.HashSet;
import java.util.Objects;

public class User {
    private String login;
    private String password;
    private String typeOfUser;


    public User(){}

    public User(String login, String password, String typeOfUser) {
        this.login = login;
        this.password = password;
        this.typeOfUser = typeOfUser;
    }

    public User(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public static User findUser(HashSet<User> users, String login){
        User uFound = new User();
        for(User u: users)
            if(u.login.compareTo(login) == 0){
                uFound = u;
                return uFound;
            }
        return uFound;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getLogin().equals(user.getLogin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin());
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", typeOfUser='" + typeOfUser + '\'' +
                '}';
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String typeOfUser) {
        this.typeOfUser = typeOfUser;
    }
}

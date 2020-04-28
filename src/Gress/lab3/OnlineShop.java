package Gress.lab3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class OnlineShop  {
    ArrayList<Order> orders = new ArrayList<>();
    Warehouse warehouseOfTheShop;
    DAO  dao;

    public OnlineShop(Warehouse w){
        warehouseOfTheShop = w;
        DAOClient daoClient = new DAOClient();
        setDao(daoClient);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String loginEntered = scan.next();
        Client c = new Client(loginEntered, "qwerty123");

    }

    public void setDao(DAO dao) {
        this.dao = dao;
    }

   /* public void signIn(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String loginEntered = scan.next();
        if(!users.contains(new User(loginEntered)))
        {
            System.out.println("This login doesn't exist. Do you want to create new account?\n" +
                    "1. yes\n2. no");
            if(scan.nextInt() == 1) signUp(loginEntered, "client");
            else return;
        }
        else {

            do {
                System.out.println("Enter your password: ");
                String passwordEntered = scan.next();
                User uFound = User.findUser(users, loginEntered);
                if (uFound.getPassword().compareTo(passwordEntered) == 0) {
                   System.out.println("You're signed in successfully");
                    return;
                } else {
                    System.out.println("Your password is not correct. Try again");
                }
            } while(true);


        }
    }
    public void signUp(String login, String typeOfUser){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scan.next();

        users.add(new Client(login, password));
        System.out.println("You're signed up successfully.\nAlso you are signed in as " + login);
        //uCurrent = User.findUser(users, login);
    }*/
    public void showAllOrders(){
        for(Order item: orders)
            System.out.println(item);
    }
    public void showClientsOrder(Client client){
        for(Order item: orders)
            for(int ids: client.getListOfOrders()){
                if(item.getId() == ids)
                    System.out.println(item);
            }

    }
    /*public void addNewSeller(User u){
        if(u.getTypeOfUser().compareTo("admin") != 0) {
            System.out.println("Sorry, but your rights are restricted. Only admins can create new admin's accounts");
            return;
        }
        System.out.println("Welcome to the method of creating a new seller");
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter login for a new seller: ");
            String loginEntered = scan.next();
            if (!users.contains(new User(loginEntered))) {
                signUp(loginEntered, "admin");
                return;
            }
            else
                System.out.println("This login exists, try another one");
        }while(true);
    }*/

}

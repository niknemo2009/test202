package Gress.lab3;
import java.util.ArrayList;

public class Client extends User {
    ArrayList<Integer> listOfOrders = new ArrayList<>();
    public Client(){}

    public Client(String login, String password) {
        super(login, password, "client");
    }
    public void addOrderID(int id){
        listOfOrders.add(id);
    }

    public ArrayList<Integer> getListOfOrders() {
        return listOfOrders;
    }
}

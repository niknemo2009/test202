package Muradian.lab3.DAO;

import Muradian.lab3.struct.Order;

import java.util.ArrayList;

public class DAOOrder implements DAO<Order> {
    ArrayList<Order> orders = new ArrayList<>();

    public DAOOrder(){
        orders.add(new Order(11, 110));
        orders.add(new Order(22, 220));
    }

    @Override
    public void create(Order o) {
        orders.add(o);
    }

    @Override
    public void delete(Order o) {
        orders.remove(o);
    }

    @Override
    public ArrayList<Order> getAll() {
        return orders;
    }

    @Override
    public void update(Order o, String[] params) {          // обновляем цену
       o.setPrice(Integer.parseInt(params[0]));
    }

    @Override
    public Order get(int id) {
        Order oFound = new Order();
        for(Order o: orders){
            if(o.getId() == id){
                oFound = o;
            }
        }
        return oFound;
    }
}

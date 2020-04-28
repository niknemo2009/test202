/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gress.lab4.dao;

import Gress.lab4.dao.DAO;
import Gress.lab4.entity.Order;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

/**
 *
 * @author Anastasiia Hress
 */
public class DAOOrder implements DAO<Order, String> {
    ArrayList <Order> orders = new ArrayList();
    
    public DAOOrder (){
        orders.add(new Order("anastasiia", 125, "delivered"));
    }
    
    @Override
    public boolean create(Order o) {
        orders.add(o);
        return true;
    }

    @Override
    public Order get(String str) {
        Order oFound = new Order();
        for(Order o: orders){
            if(o.getId()== parseInt(str)){
                oFound = o;
            }
        }
        return oFound;
    }

    @Override
    public void update(Order o, String newStatus) {
        o.setStatus(newStatus);
    }

    @Override
    public boolean delete(Order o) {
        orders.remove(o);
        return true;
    }

    @Override
    public ArrayList<Order> getAll() {
        return orders;
    }
    
    public  ArrayList<Order> getAllOfClients(String client){
        ArrayList<Order> orderOfClient = new ArrayList();
        for(Order o: orders){
            if(o.getClient().compareTo(client) == 0){
                orderOfClient.add(o);
            }                
        }
        return orderOfClient;
    }
}

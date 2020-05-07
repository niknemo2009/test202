/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gress.lab5.dao;

import Gress.lab5.entity.Order;
import static java.lang.Integer.parseInt;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Anastasiia Hress
 */
public class DAOOrder implements DAO<Order, String> {
    private Connection dbConnection;
    
    public DAOOrder (){
        dbConnection =  DBConnection.getDbConnection();
    }
    
    @Override
    public boolean create(Order order) {
        boolean result = false;
       try(PreparedStatement statement = dbConnection.prepareStatement(OrderSQL.CREATE.QUERY)){
           statement.setString(1, order.getClient());
           statement.setDouble(2, order.getPayment());
           statement.setString(3, order.getStatus());
           statement.executeUpdate();
           result = true;         
        } catch(SQLException exc){
            exc.printStackTrace();
        } 
        return result;
    }

    @Override
    public Order get(String id) {
        Order oFound = new Order();
        try(PreparedStatement statement = dbConnection.prepareStatement(OrderSQL.GET.QUERY)){
           statement.setInt(1, parseInt(id));
           ResultSet result = statement.executeQuery();
           if(result.next()){
                oFound = new Order(result.getInt("id"), result.getString("client"), 
                        result.getDouble("payment"), result.getString("status"));
            }            
        } catch(SQLException exc){
            exc.printStackTrace();
        } 
    return oFound;
    }

    @Override
    public void update(Order order, String newStatus) {
        try(PreparedStatement statement = dbConnection.prepareStatement(OrderSQL.UPDATE.QUERY)){
           statement.setString(1, newStatus);
           statement.setInt(2, order.getId());
           statement.executeUpdate();                    
        } catch(SQLException exc){
            exc.printStackTrace();
        }  
    }

    @Override
    public boolean delete(Order order) {
        boolean result = false;
        try(PreparedStatement statement = dbConnection.prepareStatement(OrderSQL.DELETE.QUERY)){
           statement.setInt(1, order.getId());
           statement.executeUpdate();
           result = true;
        } catch(SQLException exc){
            exc.printStackTrace();
        } 
        return result;
    }

    @Override
    public ArrayList<Order> getAll() {
        ArrayList<Order> allOrders = new ArrayList();
        try{
            Statement statement = dbConnection.createStatement();
            ResultSet result = statement.executeQuery(OrderSQL.GETALL.QUERY);
            while(result.next()){
        allOrders.add(new Order(result.getInt("id"),result.getString("client"), 
                result.getDouble("payment"), result.getString("status")));
        }
    }catch(SQLException exc){
        exc.printStackTrace();
    }
        return allOrders;
}
    
    public  ArrayList<Order> getAllOfClients(String client){
        ArrayList<Order> orderOfClient = new ArrayList();
       try{
            PreparedStatement statement = dbConnection.prepareStatement(OrderSQL.GETTALL_OF_CLIENTS.QUERY);
            statement.setString(1,"%" + client + "%");
            ResultSet result = statement.executeQuery();
            while(result.next()){
                orderOfClient.add(new Order(result.getInt("id"),result.getString("client"), 
                result.getDouble("payment"), result.getString("status")));
        }
    }catch(SQLException exc){
        exc.printStackTrace();
    }
        return orderOfClient;
    }
    
    enum OrderSQL{
        GETALL("SELECT * FROM orders"),
        GETTALL_OF_CLIENTS("SELECT * FROM orders WHERE client LIKE ?"),
        GET("SELECT * FROM orders WHERE id = ? "),
        UPDATE("UPDATE orders SET status = ? WHERE id = ?"),
        DELETE("DELETE FROM orders WHERE id = ?"),
        CREATE("INSERT INTO orders (client, payment, status) values (?, ?, ?)");
        
        String QUERY;
        
      OrderSQL(String QUERY){
        this.QUERY = QUERY;
        }
                
    }
}

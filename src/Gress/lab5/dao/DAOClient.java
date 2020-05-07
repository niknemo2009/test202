/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gress.lab5.dao;

import Gress.lab5.entity.Client;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Anastasiia Hress
 */
public class DAOClient implements DAO<Client, String> {
    private Connection dbConnection;	
    
    public DAOClient (){
        dbConnection =  DBConnection.getDbConnection();
    }

    @Override
    public boolean create(Client client) {
        boolean result = false;
       try(PreparedStatement statement = dbConnection.prepareStatement(ClientSQL.CREATE.QUERY)){
           statement.setString(1, client.getName());
           statement.setString(2, client.getUsername());
           statement.setString(3, client.getPassword());
           statement.setString(4, client.getEmail());
           statement.executeUpdate();
           result = true;         
        } catch(SQLException exc){
            exc.printStackTrace();
        } 
        return result;
    }

    @Override
    public Client get(String username) {        
      Client clientFound = null;
       try(PreparedStatement statement = dbConnection.prepareStatement(ClientSQL.GET.QUERY)){
           statement.setString(1, username);
           ResultSet result = statement.executeQuery();
           if(result.next()){
                clientFound = new Client(result.getString("name"), result.getString("username"), 
                        result.getString("password"), result.getString("email"));
            }            
        } catch(SQLException exc){
            exc.printStackTrace();
        } 
      return clientFound;
     }

    @Override
    public void update(Client client, String newEmail) {       
        try(PreparedStatement statement = dbConnection.prepareStatement(ClientSQL.UPDATE.QUERY)){
           statement.setString(1, newEmail);
           statement.setString(2, client.getUsername());
           statement.executeUpdate();                    
        } catch(SQLException exc){
            exc.printStackTrace();
        }         
    }

    @Override
    public boolean delete(Client client) {
        boolean result = false;
        try(PreparedStatement statement = dbConnection.prepareStatement(ClientSQL.DELETE.QUERY)){
           statement.setString(1, client.getUsername());
           statement.executeUpdate();
           result = true;
        } catch(SQLException exc){
            exc.printStackTrace();
        } 
        return result;
    }

    @Override
    public ArrayList<Client> getAll() {
    ArrayList<Client> clientsAll = new ArrayList();   
    try{
    Statement statement = dbConnection.createStatement();
    ResultSet result = statement.executeQuery(ClientSQL.GETALL.QUERY);
    while(result.next()){
        clientsAll.add(new Client(result.getString("name"), result.getString("username"), 
                result.getString("password"), result.getString("email")));
        }
    }catch(SQLException exc){
    exc.printStackTrace();
    }
    return clientsAll;
    }
    
    enum ClientSQL{
        GETALL("SELECT * FROM clients"),
        GET("SELECT * FROM clients WHERE username = ? "),
        UPDATE("UPDATE clients SET email = ? WHERE username = ?"),
        DELETE("DELETE FROM clients WHERE username = ?"),
        CREATE("INSERT INTO clients (name, username, password, email) values (?, ?, ?, ?)");
        
        String QUERY;
        
        ClientSQL(String QUERY){
        this.QUERY = QUERY;
        }                
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gress.lab4.dao;

import Gress.lab4.dao.DAO;
import Gress.lab4.entity.Client;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Anastasiia Hress
 */
public class DAOClient implements DAO<Client, String> {
    HashSet<Client> clients = new HashSet();
    public DAOClient (){
        clients.add(new Client("Nastia", "admin", "admin", "admin@gmail.com"));
        clients.add(new Client("Nastia", "anastasiia", "humanity", "nastia@gmail.com"));
    }

    @Override
    public boolean create(Client client) {
        boolean result = false;
        if(!clients.contains(client))
        {
            clients.add(client);
            result = true;
        }
        return result;
    }

    @Override
    public Client get(String username) {        
      Client clientFound = null;
      for(Client c: clients){
          if(c.getUsername().compareTo(username) == 0) {
              clientFound = c;
            } 
        }
      return clientFound;
    }

    @Override
    public void update(Client client, String newEmail) {       
        client.setEmail(newEmail);
        
    }

    @Override
    public boolean delete(Client client) {
        boolean result = false;
        if(clients.contains(client))
        {
            clients.remove(client);
            result = true;
        }
        return result;
    }

    @Override
    public ArrayList<Client> getAll() {
      ArrayList<Client> clientsAll = new ArrayList();        
      for(Client c: clients){
          clientsAll.add(c);
        }
        return clientsAll;
    }
    
}

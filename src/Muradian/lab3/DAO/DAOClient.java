package Muradian.lab3.DAO;

import Muradian.lab3.struct.Client;

import java.util.ArrayList;

public class DAOClient implements DAO<Client> {
    ArrayList<Client> clients = new ArrayList<>();

    public DAOClient(){
        clients.add(new Client("Nastia", 11, 1111));
        clients.add(new Client("Andrei", 22, 2222));
    }

    @Override
    public void create(Client c) {
        clients.add(c);
    }

    @Override
    public void delete(Client c) {
        clients.remove(c);
    }

    @Override
    public ArrayList<Client> getAll() {
        return clients;
    }

    @Override
    public void update(Client c, String[]params) {
        c.setPlace(Integer.parseInt(params[0]));        // обновление место
    }

    @Override
    public Client get(int code) {
        Client cFound = new Client();
        for(Client c: clients){
            if(c.getCode() == code){
                cFound = c;
            }
        }
        return cFound;
    }
}

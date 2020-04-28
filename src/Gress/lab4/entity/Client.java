/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gress.lab4.entity;

import java.util.Objects;

/**
 *
 * @author Anastasiia Hress
 */
public class Client {
    private String name;
    private String username;
    private String password;
    private String email;

    public Client(String name, String username, String password, String email) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    

    public Client() {
       
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Client)) return false;
        Client c = (Client) obj;
        return getUsername().equals(c.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }
    
}

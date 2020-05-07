/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gress.lab5.entity;

import java.util.ArrayList;

/**
 *
 * @author Anastasiia Hress
 */
public class Order {
    private int id;
    private String client;   
    private double payment;
    private String status;    
            
    public Order(int id, String client, double payment, String status) {
        this.id = id;
        this.client = client;        
        this.payment = payment;
        this.status = status;
    }

    public Order() {
        
    }   
   

    public int getId() {
        return id;
    }

    public String getClient() {
        return client;
    }

   

    public double getPayment() {
        return payment;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClient(String client) {
        this.client = client;
    }

   

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + "client=" + client + ", payment=" + payment + ", status=" + status + '}';
    }

    
    
}

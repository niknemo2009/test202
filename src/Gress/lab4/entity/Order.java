/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gress.lab4.entity;

import Gress.lab4.entity.Book;
import java.util.ArrayList;

/**
 *
 * @author Anastasiia Hress
 */
public class Order {
    private static long id = 0;
    private String client;   
    private double payment;
    private String status;    
            
    public Order(String client, double payment, String status) {
        id++;
        this.client = client;        
        this.payment = payment;
        this.status = status;
    }

    public Order() {
        
    }   
   

    public long getId() {
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

    public void setId(long id) {
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

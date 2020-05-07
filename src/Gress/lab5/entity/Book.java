/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gress.lab5.entity;

import java.util.Objects;

/**
 *
 * @author Anastasiia Hress
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private String description;
    private int inStock;
    private double price;
    
    public Book(int id, String name, String author,String publishingHouse, String description, int inStock, double price) {
        this.id = id;
        this.title = name;
        this.author = author; 
        this.publisher = publishingHouse;
        this.description = description;
        this.inStock = inStock;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public Book() {
    }       

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDescription() {
        return description;
    }

    public int getInStock() {
        return inStock;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " id: " + id + "\n title: " + title + "\n author:" + author + "\n publisher: " + publisher + "\n description: " + description + "\n inStock:" + inStock + "\n price: " + price;
    }

    
    
    
}

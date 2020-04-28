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
public class Book {
    private long id;
    private String title;
    private String author;
    private String publishingHouse;
    private String description;
    private int inStock;
    private double price;
    
    public Book(int id, String name, String author,String publishingHouse, String description, int inStock, double price) {
        this.id = id;
        this.title = name;
        this.author = author; 
        this.publishingHouse = publishingHouse;
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

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.title = name;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
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

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return title;
    }

    public String getPublishingHouse() {
        return publishingHouse;
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
        return " id: " + id + "\n title: " + title + "\n author:" + author + "/n publishingHouse: " + publishingHouse + "\n description: " + description + "\n inStock:" + inStock + "\n price: " + price;
    }

    
    
    
}

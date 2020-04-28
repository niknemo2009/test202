/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gress.lab4.dao;

import Gress.lab4.dao.DAO;
import Gress.lab4.entity.Book;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;


/**
 *
 * @author Anastasiia Hress
 */
public class DAOBook implements DAO<Book, Integer>{
    ArrayList<Book> books = new ArrayList();
    
    public DAOBook(){
    books.add(new Book(1,"Pet Sematary", "Stephen King", "ACT", "horror book", 5, 125));
    books.add(new Book(2,"Martian Chronicles", "Ray Bradbury", "ACT", "science fiction", 7, 179));
    books.add(new Book(3,"Dandelion Wine", "Ray Bradbury", "ACT", "science fiction", 9, 153));
    books.add(new Book(4,"An Astronaut's Guide to Life on Earth", "Chris Hadfield", "Little, Brown and Company", "science fiction", 7, 179));
    }
    
    @Override
    public boolean create(Book b) {
        books.add(b);
        return true;
    }

    @Override
    public Book get(String str) { 
        Book bFound = new Book();
        for(Book b: books){
            if(b.getId() == parseInt(str)){
                bFound = b;
            }
        }
        return bFound;
    }

    @Override
    public void update(Book b, Integer newInStock) {
        b.setInStock(newInStock);              
    }
    public void updatePrice(Book b, Integer newPrice) {
        b.setPrice(newPrice);              
    }

    @Override
    public boolean delete(Book b) {
       books.remove(b);
       return true;
    }

    @Override
    public ArrayList<Book> getAll() {
        return books;
    }
    
    public ArrayList<Book> getAllByAuthor(String author){
     ArrayList<Book> booksFilteredByAuthor = new ArrayList();
     for(Book b: books){
        if(b.getAuthor().compareTo(author)== 0){
            booksFilteredByAuthor.add(b);
        }
     }
     return booksFilteredByAuthor;
    }
    
    public ArrayList<Book> getAllByName(String name){
     ArrayList<Book> booksFilteredByName = new ArrayList();
     for(Book b: books){
        if(b.getAuthor().compareTo(name) > 0){
            booksFilteredByName.add(b);
        }
     }
     return booksFilteredByName;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gress.lab5.dao;

import Gress.lab5.entity.Book;
import java.sql.*;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;


/**
 *
 * @author Anastasiia Hress
 */
public class DAOBook implements DAO<Book, Integer>{
    private java.sql.Connection dbConnection;
    
    public DAOBook(){
        dbConnection = DBConnection.getDbConnection();
    }
    
    @Override
    public boolean create(Book book) {
        boolean result = false;
       try(PreparedStatement statement = dbConnection.prepareStatement(BookSQL.CREATE.QUERY)){
           statement.setString(1, book.getTitle());
           statement.setString(2, book.getAuthor());
           statement.setString(3, book.getPublisher());
           statement.setString(4, book.getDescription());
           statement.setInt(5, book.getInStock());
           statement.setDouble(6, book.getPrice());
           statement.executeUpdate();
           result = true;         
        } catch(SQLException exc){
            exc.printStackTrace();
        } 
        return result;
    }

    @Override
    public Book get(String id) { 
        Book bFound = new Book();
        try(PreparedStatement statement = dbConnection.prepareStatement(BookSQL.GET.QUERY)){
           statement.setInt(1, parseInt(id));
           ResultSet result = statement.executeQuery();
           if(result.next()){
                bFound = new Book(result.getInt("id"),result.getString("title"), 
                        result.getString("author"), result.getString("publisher"), 
                        result.getString("description"), result.getInt("inStock"), 
                        result.getDouble("price") );
            }            
        } catch(SQLException exc){
            exc.printStackTrace();
        } 
        return bFound;
    }

    @Override
    public void update(Book book, Integer newInStock) {
         try(PreparedStatement statement = dbConnection.prepareStatement(BookSQL.UPDATE_IN_STOCK.QUERY)){
           statement.setInt(1, newInStock);
           statement.setInt(2, book.getId());
           statement.executeUpdate();                    
        } catch(SQLException exc){
            exc.printStackTrace();
        }         
    }
    public void updatePrice(Book book, Integer newPrice) {
         try(PreparedStatement statement = dbConnection.prepareStatement(BookSQL.UPDATE_PRICE.QUERY)){
           statement.setInt(1, newPrice);
           statement.setDouble(1, book.getId());
           statement.executeUpdate();                    
        } catch(SQLException exc){
            exc.printStackTrace();
        }         
    }

    @Override
    public boolean delete(Book book) {
        boolean result = false;
        try(PreparedStatement statement = dbConnection.prepareStatement(BookSQL.DELETE.QUERY)){
           statement.setInt(1, book.getId());
           statement.executeUpdate();
           result = true;
        } catch(SQLException exc){
            exc.printStackTrace();
        } 
       return result;
    }

    @Override
    public ArrayList<Book> getAll() {
    ArrayList<Book> booksAll = new ArrayList();    
        try{
    Statement statement = dbConnection.createStatement();
    ResultSet result = statement.executeQuery(BookSQL.GETALL.QUERY);
    while(result.next()){
        booksAll.add(new Book(result.getInt("id"),result.getString("title"), 
                result.getString("author"), result.getString("publisher"), 
                result.getString("description"), result.getInt("inStock"), 
                result.getDouble("price") ));
        }
    }catch(SQLException exc){
    exc.printStackTrace();
    }
    return booksAll;
}
    
   
    
    enum BookSQL{
        GETALL("SELECT * FROM books"),
        GET("SELECT * FROM books WHERE id = ? "),
        UPDATE_IN_STOCK("UPDATE books SET inStock = ? WHERE id = ?"),
        UPDATE_PRICE("UPDATE books SET price = ? WHERE id = ?"),
        DELETE("DELETE FROM books WHERE id = ?"),
        CREATE("INSERT INTO books (title, author, publisher, description, inStock, price) values (?, ?, ?, ?, ?, ?)");
        
        String QUERY;
        
        BookSQL(String QUERY){
        this.QUERY = QUERY;
        }
                
    }
}

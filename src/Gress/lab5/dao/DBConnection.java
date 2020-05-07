package Gress.lab5.dao;



import java.sql.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anastasiia Hress
 */
public class DBConnection {
    private static String user = "root";
    private static String password = "Na9gKR06";
    private static String url = "jdbc:mysql://localhost:3306/book_shop?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static Connection dbConnection;
   
    public static Connection getDbConnection() {
    try{
       dbConnection = DriverManager.getConnection(url, user, password);
    }catch(SQLException exc){
       exc.printStackTrace();
    }
        return dbConnection;
    } 
}

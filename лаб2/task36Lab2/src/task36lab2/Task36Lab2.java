/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task36lab2;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task36Lab2 {
    
    public static void main(String[] args) {
        String d0 = "21-02-2018";
        String y = d0.substring(6, 10);
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date2 = dateFormat.parse(d0);
            Date date1 = dateFormat.parse("01-01-"+ y);
 
            System.out.println("Первая дата: " + date1);
            System.out.println("Вторая дата: " + date2);
            
            long milliseconds = date2.getTime() - date1.getTime();
            
            int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
            System.out.println("Разница между датами в днях: " + days);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

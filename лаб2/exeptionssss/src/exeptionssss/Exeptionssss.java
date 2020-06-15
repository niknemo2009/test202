/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeptionssss;

class MyException extends Exception 
{  
  
    // default constructor 
    MyException() {    } 
  
    // parametrized constructor 
    MyException(String str) { super(str); }
    
} 

public class Exeptionssss {

    public static void main(String[] args) {
        int a = 2;
        int b;
        try{
            b = a/0;
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        finally{
            //System.out.println("Finally");
        }
        //-------------------------------------------------------
        int[] array = new int[3];
        try{
            b = array[4];
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        finally{
            //System.out.println("Finally");
        }
        //--------------------------------------------------------
        int i = 0;
        int[] nArray = new int[5];
    
        while(true)
        {
            try
            {
                nArray[i] = i;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("\n" + e.toString()); 
                break;
            }
        i++;
        }
        //----------------------------------------------------------
        String ptr = null; 
        try
        { 
            if (ptr.equals("gfg")) 
                System.out.print("Same"); 
            else 
                System.out.print("Not Same"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.println("NullPointerException Caught"); 
        } 
        //----------------------------------------------------------
        try  {
            MyException me = new MyException("MyException"); 
            throw me; 
        } //end of try 
  
        catch (MyException e) { 
            System.out.println(e.toString()); 
        } 
    }
    
}

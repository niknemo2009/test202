/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

enum Positions{
    DIRECTOR(30000, "01.08 - 28.08"),
    HR(15000, "05.09 - 30.09"),
    MANAGER(20000, "24.08 - 06.09"),
    SECRETARY(6000, "14.08 - 27.08"),
    LAWYER(10000, "10.08 - 28.08"),
    ACCOUNTANT(7000, "01.08 - 15.08");
    //fields
    private int salary;
    private String restDays;
    //constructors
    Positions(){salary = 0; restDays = "";}
    Positions(int salary, String restDays)
    {
        this.salary = salary;
        this.restDays = restDays;
    }
    //get and set
    public int GetSalary(){ return salary;}
    void SetSalary(int salary){this.salary = salary;}
    public String GetRestDays(){ return restDays;}
    void SetRestDays(String restDays){this.restDays = restDays;}
    //methods
    public static void showSrD(Positions position)
    {
        System.out.println("Salary: " + position.GetSalary() + ", rest days are " + position.GetRestDays());
    }
    public static void SetFields(Positions position, int salary, String restDays)
    {
        position.SetSalary(salary);
        position.SetRestDays(restDays);
    }
}

public class Lab2 
{
    public int task22()
    {
        int n = 0;
        int c = 0;
        try 
        {
            c = 10/n;
        }
        catch (ArithmeticException e) 
        {
            System.out.println("div by 0");
            n = 2;
            c = 10/n;
        }
        return c;
    }
    //task25 enum
    
    
    public static void main(String[] args) 
    {
        Lab2 obj = new Lab2();
        //task22
        //System.out.println("c = " + obj.task22());
        //task25
        //Positions.showSrD(Positions.LAWYER);
        //Positions.SetFields(Positions.LAWYER, 222222, "18.10 - 22.01");
        //Positions.showSrD(Positions.LAWYER);
        //task29
    }
}


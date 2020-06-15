/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task29lab2;

public class Task29Lab2 {

    public static void main(String[] args) {
        Schoolkid sk = new Schoolkid("Viktor", 16, true);
        Student st = new Student("Yura", true);
        Pensioner ps = new Pensioner("Andrey", 80, true);
        Pensioner ps2 = new Pensioner("Dima", 55, true);
        
        FitnessCenter fc = new FitnessCenter(3);
        
        fc.AddVisitor(ps);
        fc.AddVisitor(st);
        //fc.AddVisitor(st); // no way
        fc.AddVisitor(sk); 
        fc.AddVisitor(ps2); 
        fc.GetAll();
    }
    
}

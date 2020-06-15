/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task29lab2;

/**
 *
 * @author Ася
 */
public class Pensioner extends Visitor{
    public int age;
    
    Pensioner(){name = ""; age = 0;}
    Pensioner(String name, int age, boolean ability){
        this.name = name;
        this.age = age;
        this.canTrain = ability;
    }
}

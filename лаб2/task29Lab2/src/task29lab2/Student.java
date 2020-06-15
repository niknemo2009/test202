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
public class Student extends Visitor {
    Student(){name = "";}
    Student(String name, boolean ability)
    {
        this.name = name;
        this.canTrain = ability;
    }
}

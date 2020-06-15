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
public class Visitor implements IVisitor{
    boolean canTrain = true;
    String name;
    public boolean GetAble(Schoolkid a){
        if (a.age < 16){
            a.canTrain = false;
        }
        return canTrain;
    }
    public boolean GetAble(Pensioner a){
        if (a.age > 80){
            a.canTrain = false;
        }
        return canTrain;
    }
    public boolean GetAble(Student a){
        return canTrain;
    }
}

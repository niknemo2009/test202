/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task29lab2;
import java.util.ArrayList;

/**
 *
 * @author Ася
 */
public class FitnessCenter {
    int AmountOfPeople;
    FitnessCenter(){AmountOfPeople = 1;}
    FitnessCenter(int amount){AmountOfPeople = amount;}
    ArrayList<Visitor> people = new ArrayList<Visitor>(AmountOfPeople);
    
    public void GetAll(){
        for(int i = 0;i<people.size();i++){
            System.out.println(i + ". " + people.get(i).name);
        }
    }
    
    public void AddVisitor(Student a){
        boolean nod = true;
        for(int i = 0; i<people.size();i++){
            if (people.get(i).name == a.name){
                nod = false;
                i = people.size();
            }
        }
        if(nod == true){
            if(a.GetAble(a)==true){
                if(people.size()<AmountOfPeople){
                    people.add(a);
                }
                else{
                    System.out.println("There are too much people in center, please wait");
                }
            }else{
                System.out.println(a.name + " is not able to train");
            }
        }
        else{
            System.out.println("You can't register mor then one person with name " + a.name);
        }
    }
    
    public void AddVisitor(Schoolkid a){
        boolean nod = true;
        for(int i = 0; i<people.size();i++){
            if (people.get(i).name == a.name){
                nod = false;
                i = people.size();
            }
        }
        if(nod == true){
            if(a.GetAble(a)==true){
                if(people.size()<AmountOfPeople){
                    people.add(a);
                }
                else{
                    System.out.println("There are too much people in center, please wait");
                }
            }else{
                System.out.println(a.name + " is not able to train");
            }
        }
        else{
            System.out.println("You can't register mor then one person with name " + a.name);
        }
    }
    public void AddVisitor(Pensioner a){
        boolean nod = true;
        for(int i = 0; i<people.size();i++){
            if (people.get(i).name == a.name){
                nod = false;
                i = people.size();
            }
        }
        if(nod == true){
            if(a.GetAble(a)==true){
                if(people.size()<AmountOfPeople){
                    people.add(a);
                }
                else{
                    System.out.println("There are too much people in center, please wait");
                }
            }
            else{
                System.out.println(a.name + " is not able to train");
            }
        }
        else{
            System.out.println("You can't register mor then one person with name " + a.name);
        }
        
    }
}

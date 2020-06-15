/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Ася
 */
public class Spaceship {
    int weight;
    Races race;
    String name;
    
    Spaceship(){
        this.weight = 0; 
        this.race = null;
        this.name = "";
    }
    Spaceship(String name, int weight, Races race){
        this.weight = weight; 
        this.race = race;
        this.name = name;
    }
    
    Races GetRace(){
        return race;
    }
    
    @Override
    public String toString(){
        return name;
    }
}

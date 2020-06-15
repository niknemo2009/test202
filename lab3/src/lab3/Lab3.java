/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.ArrayList;

/**
 *
 * @author Ася
 */
public class Lab3 {
    
    ArrayList<Spaceship> CreateList(int placeCount){
        ArrayList<Spaceship> places = new ArrayList<Spaceship>(placeCount);
        for(int i = 0; i < placeCount-1; i++){
            places.add(new Spaceship("sp"+i, 1, Races.TURIAN));
        }
        return places;
    }
    
    void AddAllShips(Piligrim piligrim, ArrayList<Spaceship> places){
        for(int i = 0; i < places.size(); i++){
            piligrim.AddShip(places.get(i));
        }
    }
    
    public static void main(String[] args) {
        
        Lab3 lb = new Lab3();
        int placeCount = 10;
        int maxWeight = 20;
        Piligrim piligrim = new Piligrim(placeCount, maxWeight);
        ArrayList<Spaceship> places = lb.CreateList(placeCount);
        lb.AddAllShips(piligrim, places);
        piligrim.AddShip(new Spaceship("adfaf", 1, Races.EARTHLING));
        
        piligrim.ShowAllShips();
    }
    
}

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
public class Piligrim {
    int placeCount;
    int maxWeight;
    int currentWeight = 0;
    
    Piligrim()
    {
        placeCount = 0;
        maxWeight = 0;
    }
    Piligrim(int placeCount, int maxWeight)
    {
        this.placeCount = placeCount;
        this.maxWeight = maxWeight;
    }
    
    ArrayList<Spaceship> places = new ArrayList<Spaceship>(placeCount);
    
    void AddShip(Spaceship ship){
        boolean answer;
        answer = HavePlace();
        if(answer){
            answer = CheckRaceConnection(ship);
            if(answer){
                answer = CheckWeight(ship);
                if(answer){
                    answer = FindDublicates(ship);
                }
            }
        }
        if(answer){
            places.add(ship);
            currentWeight += ship.weight;
        }
        else{
            System.out.println(ship.name + " ship wasn't added :(");
        }
    }
    
    void RemoveShip(Spaceship ship){
        for(int i = 0; i < places.size(); i++){
            if(places.get(i).name == ship.name){
                places.remove(i);
            }
        }
    }
    
    void ShowAllShips(){
        for(int i = 0; i < places.size(); i++){
            System.out.println(i + ". " + places.get(i).name);
        }
        System.out.println("Total ships: " + places.size());
    }
    
    boolean FindDublicates(Spaceship ship){
        boolean answer = true;
        if(places.size() > 0){
            for(int i = 0; i < places.size(); i++){
                if(places.get(i).name == ship.name){
                    answer = false;
                    System.out.println(ship.name + " already was added!");
                    i = places.size();
                }
            }
        }
        return answer;
    }
            
    boolean HavePlace (){
        boolean answer = true;
        if(places.size() == placeCount){
            answer = false;
            System.out.println("There is no place for any ships now!");
        }
        return answer;
    }
    
    boolean CheckRaceConnection(Spaceship ship){
        boolean answer = true;
        if(places.size() > 0){
            for(int i = 0; i < places.size(); i++){
                Spaceship temp = places.get(i);
                switch(ship.GetRace()){
                    case EARTHLING:
                        switch(temp.GetRace()){
                            case TURIAN:
                                answer = false;
                                i = places.size();
                                System.out.println("You can't add " + ship.GetRace() + ", becouse there is " + temp.GetRace() + " on station");
                            break;
                        }
                        break;
                    case HODAKIAN:
                        switch(temp.GetRace()){
                            case TURIAN:
                                answer = false;
                                i = places.size();
                                System.out.println("You can't add " + ship.GetRace() + ", becouse there is " + temp.GetRace() + " on station");
                            break;
                        }
                    break;
                    case TURIAN:
                        switch(temp.GetRace()){
                            case HODAKIAN:
                                answer = false;
                                i = places.size();
                                System.out.println("You can't add " + ship.GetRace() + ", becouse there is " + temp.GetRace() + " on station");
                            break;
                            case EARTHLING:
                                answer = false;
                                i = places.size();
                                System.out.println("You can't add " + ship.GetRace() + ", becouse there is " + temp.GetRace() + " on station");
                            break;
                        }
                    break;
                }
            }
        }
        return answer;
    }
    
    boolean CheckWeight(Spaceship ship){
        boolean answer = true;
        if(this.currentWeight + ship.weight > this.maxWeight){
            answer = false;
            System.out.println(ship.name + "is too heavy for station now!");
        }
        return answer;
    }
}

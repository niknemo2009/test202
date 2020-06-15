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
public enum Races {
    TURIAN("turian"),
    EARTHLING("earthling"),
    HODAKIAN("hodakian");
    private String raceName;
    
    Races(){raceName = "";}
    Races(String raceName)
    {
        this.raceName = raceName;
    }
    
    public String GetRaceName(){ return raceName;}
    void SetRaceName(String raceName){this.raceName = raceName;}
    
    public static void showSrD(Races race)
    {
        System.out.println("Race: " + race.GetRaceName());
    }
}

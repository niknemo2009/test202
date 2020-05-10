package Muradian.lab3.struct;

import java.util.HashMap;

public class Dish {
    private int id;
    private String name;
    private int price;
    private HashMap<String, Integer> ingredients = new HashMap<>();

    public Dish(){}

    public Dish(int id, String name, int price, HashMap<String, Integer> ingredients){
        this.id = id;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public void setId(int id) { this.id = id; };
    public void setName(String name) { this.name = name; };
    public void setPrice(int price) { this.price = price; };
    public void setIngredients(HashMap<String, Integer> ingredients) { this.ingredients = ingredients; };

    public int getId() { return id; };
    public String getName() { return name; };
    public int getPrice() { return price; };
    public HashMap<String, Integer> getIngredints() { return ingredients; };


}



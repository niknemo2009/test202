package Muradian.lab3.DAO;

import Muradian.lab3.struct.Dish;

import java.util.ArrayList;
import java.util.HashMap;

public class DAODish implements DAO<Dish> {
    ArrayList<Dish> dishes = new ArrayList<>();

    HashMap<String, Integer> misoSoup(){
        HashMap<String, Integer> misoSoup = new HashMap<>();
        misoSoup.put("Water", 100);
        misoSoup.put("Miso", 30);
        misoSoup.put("Tofu", 20);
        misoSoup.put("Seaweed", 10);
        return misoSoup;
    }
    HashMap<String, Integer> tomatoSoup(){
        HashMap<String, Integer> tomatoSoup = new HashMap<>();
        tomatoSoup.put("Water", 100);
        tomatoSoup.put("Tomato", 30);
        tomatoSoup.put("Pepper", 5);
        tomatoSoup.put("Onion", 10);
        return tomatoSoup;
    }

    public DAODish(){
        dishes.add(new Dish(1, "Karen", 100, misoSoup()));
        dishes.add(new Dish(2, "Mark", 150, tomatoSoup()));
    }

    @Override
    public void create(Dish d) {
        dishes.add(d);
    }

    @Override
    public void delete(Dish d) {
        dishes.remove(d);
    }

    @Override
    public ArrayList<Dish> getAll() {
        return dishes;
    }

    @Override
    public void update(Dish d, String[]params) {
        d.getIngredints().put(params[0], Integer.parseInt(params[1]));  // в хешмепе "ингредиенты" обновляем количество какого-то ингредиента
    }

    @Override
    public Dish get(int id) {
        Dish dFound = new Dish();
        for(Dish d: dishes){
            if(d.getId() == id){
                dFound = d;
            }
        }
        return dFound;
    }

}

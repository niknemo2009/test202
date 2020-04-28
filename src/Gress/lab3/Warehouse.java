package Gress.lab3;
import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private HashMap<Product, Integer> prodInStorage = new HashMap<>();
    public Warehouse(){
        prodInStorage.put(new Product("x22", "juice", "sadochek", 25), 0);
        prodInStorage.put(new Product("x27", "juice", "sadochek", 25), 12);
    }
    public int getAmount(Product p){
        int amount;
        if(!prodInStorage.containsKey(p)){
            System.out.println("This product isn't available in this warehouse");
            return -1;
        }
        amount = prodInStorage.get(p);
        return amount;
    }
    public void changeAmount(Product p, int amount){
        if(!prodInStorage.containsKey(p)){
            System.out.println("This product isn't available");
            return;
        }
        else{
            int newAmount = prodInStorage.get(p) + amount;
            prodInStorage.put(p, newAmount);
        }


    }
    public void showAvailable(){
        for(Map.Entry<Product, Integer> item: prodInStorage.entrySet()){
            if(item.getValue() != 0)
                System.out.println(item);
        }
    }
    public void addProduct(Product p, int amount) {
        if(prodInStorage.containsKey(p))
            changeAmount(p, amount);
        else
            prodInStorage.put(p, amount);

    }
    public boolean takeProduct(Product p, int amount){
        if(!prodInStorage.containsKey(p)){
            System.out.println("This product isn't available");
            return false;
        }
            int prodLeft = prodInStorage.get(p) - amount;
            if(prodLeft < 0){
                System.out.println("Insufficient amount in stock");
                return false;
            }
            else {
                prodInStorage.put(p, prodLeft);
            }
        return true;
    }
    public void searchProd(String name, String criteria){
        switch(criteria){
            case "name":
                for(Map.Entry<Product, Integer> item: prodInStorage.entrySet()) {
                    if(item.getKey().getName().compareTo(name) == 0)
                        System.out.println(item);
                }
                break;
            case "manufacturer":
                for(Map.Entry<Product, Integer> item: prodInStorage.entrySet()) {
                    if(item.getKey().getManufacturer().compareTo(name) == 0)
                        System.out.println(item);
                }
                break;
        }

        }
    }


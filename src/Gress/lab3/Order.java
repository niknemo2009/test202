package Gress.lab3;
import java.util.HashMap;
import java.util.Map;

public class Order {


    HashMap<Product, Integer> prodInCart = new HashMap<>();
    double totalPrice;
    static int id = 1;
    String status;
    Client ownerOfOrder;

    public Order(Client c){

        ownerOfOrder =  c;
        id++;
    }

    public static int getId() {
        return id;
    }

    public void changeAmountInOrder(Product p, int amount, Warehouse w){
        if(prodInCart.containsKey(p)) {
            int newAmount = prodInCart.get(p) + amount;
            if (w.takeProduct(p, amount)) {
                prodInCart.put(p, newAmount);
            }
        }
        else {
            prodInCart.put(p, amount);
        }
        if(amount > 0)
            System.out.println("Product added successfully");
        else
            System.out.println("Product (with the amount written) removed successfully");
    }

    public void deleteFromOrder(Product p, Warehouse w){
        if(prodInCart.containsKey(p)){
            System.out.println("This product isn't in your cart");
        }
        else {
            prodInCart.remove(p);
            System.out.println("Product removed successfully");
            w.addProduct(p, prodInCart.get(p));
        }
    }

    public void showCart(){
        countPrice();
        System.out.println(this);
    }

    public void countPrice(){
        totalPrice = 0;
        for(Map.Entry<Product, Integer> item: prodInCart.entrySet()){
            totalPrice += item.getKey().getPrice() * item.getValue();
        }
    }

    public void makeOrder(){
        ownerOfOrder.addOrderID(id);
        status = "in process";
    }

    public void changeOrderStatus(String newStatus){
        status = newStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "prodInCart=" + prodInCart +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

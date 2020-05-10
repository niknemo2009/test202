package Muradian.lab3.struct;

public class Order {
    private int id;
    private int price;

    public Order(){};

    public Order(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public void setId(int id) { this.id = id; };
    public void setPrice(int price) { this.price = price; };

    public int getId() { return id; };
    public int getPrice() { return price; };

}

package Gress.lab3;
import java.util.Objects;

public class Product {


    private String vendorCode;
    private String name;
    private String manufacturer;
    private double price;

    public Product(String vendorCode, String name, String manufacturer, double price) {
        this.vendorCode = vendorCode;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return vendorCode.equals(product.vendorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorCode);
    }

    @Override
    public String toString() {
        return "Product{" +
                "vendorCode='" + vendorCode + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }
}

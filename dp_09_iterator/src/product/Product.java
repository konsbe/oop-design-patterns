package product;

public class Product {
    String name;
    double price;
    String description;

    public Product(String name, String description, double price) {
        this.name = name;
        this.price = price;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

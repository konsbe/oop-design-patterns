package controller;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ShoppingCart {
    List<Product> productList;


    public ShoppingCart(){
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public void removeProduct(Product product) {
        this.productList.remove(product);
    }
    public int calculateTotal(){
        int sum =0;
        for(Product product: productList)sum +=product.getPrice();
        return sum;
    }
    public void pay(Payment paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}

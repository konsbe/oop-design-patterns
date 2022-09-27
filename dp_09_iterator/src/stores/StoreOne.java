package stores;

import models.StoreOneIterator;
import product.Product;

import java.util.ArrayList;

public class StoreOne {
    private ArrayList<Product> catalog;

    public StoreOne() {
        catalog = new ArrayList<>();
        addItem("core gts","loop n big-air",1200.92);
        addItem("cabrinha fx","loop, big -air n freestyle",1300.92);
        addItem("north orbit","loop n big-air",1400.92);
        addItem("north pulse","loop - freestyle",1000.92);
    }
    public void addItem(String name, String description, double price){
        Product product = new Product(name,description,price);
        catalog.add(product);
    }

    public ArrayList<Product> getCatalog() {
        return catalog;
    }//we don't need this with the iterator we made
    public StoreOneIterator createIterator(){
        return new StoreOneIterator(catalog);
    }
}

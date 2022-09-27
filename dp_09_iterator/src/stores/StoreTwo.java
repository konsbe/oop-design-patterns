package stores;

import iterator.IIterator;
import iterator.Iterator;
import models.StoreTwoIterator;
import product.Product;


public class StoreTwo implements IIterator {
    private static final int MAX_ITEMS =4;
    private int numberOfProducts = 0;

    public StoreTwo() {
        catalog = new Product[MAX_ITEMS];
        addItem("C++","bare-metal",33.92);
        addItem("Java","software-engineering",33.92);
        addItem("-ts","software-n-web-engineering",33.92);
        addItem("rust","compilers",33.92);
    }

    Product[] catalog;
    public void addItem(String name, String description, double price){
        Product product = new Product(name,description,price);
        if(numberOfProducts>= MAX_ITEMS){
            System.out.println("Catalog is full!");
        }else {
            catalog[numberOfProducts]=product;
            numberOfProducts+=1;
        }
    }
    public Product[] getCatalog(){
        return catalog;
    }//we don't need this with the iterator we made
    public StoreTwoIterator createIterator(){
        return new StoreTwoIterator(catalog);
    }
}

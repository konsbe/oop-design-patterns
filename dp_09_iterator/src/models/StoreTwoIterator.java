package models;

import product.Product;

import java.util.Iterator;

public class StoreTwoIterator implements Iterator {
    Product[] catalog;
    int position = 0;

    public StoreTwoIterator(Product[] catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        return (position >= catalog.length || catalog[position] == null) ? false : true;
    }

    @Override
    public Object next() {
        Product product = catalog[position];
        position += 1;
        return product;
    }

    @Override
    public void remove() {
        if (position<=0){
            throw new IllegalStateException("Cant remove item from an empty list");
        }
        if(catalog[position-1] ==null){
            for (int i = 9;i<catalog.length;i++){
                catalog[i] = catalog[i+1];
            }
            catalog[catalog.length -1] = null;
        }

    }
}

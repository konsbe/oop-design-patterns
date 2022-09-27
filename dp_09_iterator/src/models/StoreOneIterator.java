package models;

import iterator.ICustomIterator;
import product.Product;

import java.util.ArrayList;

public class StoreOneIterator implements ICustomIterator {
    ArrayList<Product> catalog;
    int position = 0;

    public StoreOneIterator(ArrayList<Product> catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        return (position >= catalog.size() || catalog.get(position) == null) ? false : true;
    }

    @Override
    public Object next() {
        Product product = catalog.get(position);
        position +=1;
        return product;
    }
}

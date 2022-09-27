import models.StoreOneIterator;
import product.Product;
import stores.StoreOne;
import stores.StoreTwo;

import java.util.ArrayList;
import iterator.Iterator;

public class Main {
    public static void main(String[] args) {

        StoreOne firstStore = new StoreOne();
        ArrayList<Product> firstCatalog = firstStore.getCatalog();//we don't need this with the iterator we made
        StoreTwo secondStore = new StoreTwo();
        Product[] secondCatalog = secondStore.getCatalog();//we don't need this with the iterator we made
        Iterator firstIterator = new Iterator(firstStore,secondStore);
        firstIterator.printCatalog();

//        for (int i = 0; i <secondCatalog.length; i++){
//            Product product = secondCatalog[i];
//            System.out.println(product.getName());
//        }//we don't need this with the iterator we made
//        for (int i = 0; i <firstCatalog.size(); i++){
//            Product product = (Product) firstCatalog.get(i);
//            System.out.println(product.getName());
//        }//we don't need this with the iterator we made
    }
}
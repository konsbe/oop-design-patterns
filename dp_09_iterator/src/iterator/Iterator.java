package iterator;

import models.StoreOneIterator;
import models.StoreTwoIterator;
import product.Product;
import stores.StoreOne;
import stores.StoreTwo;

public class Iterator {
    StoreOne firstStore;
    IIterator secondStore;

    public Iterator(StoreOne firstStore,IIterator secondStore) {
        this.firstStore = firstStore;
        this.secondStore = secondStore;
    }
    public void printCatalog(){
        StoreOneIterator storeOneIterator = firstStore.createIterator();
        System.out.println("first catalog!");
        printThisCatalog((StoreOneIterator) storeOneIterator);
        java.util.Iterator storeTwoIterator = secondStore.createIterator();
        System.out.println("Second catalog!");
        printThisCatalog((java.util.Iterator) storeTwoIterator);
    }
    private void printThisCatalog(java.util.Iterator iterator) {
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.println(product.getName());
        }
    }
    private void printThisCatalog(StoreOneIterator iterator){
        while(iterator.hasNext()){
            Product product = (Product) iterator.next();
            System.out.println(product.getName());
        }
    }
}
//interface MYIterator extends IIterator, java.util.Iterator{};
import interfaces.Store;
import model.Product;
import model.StoreOne;
import model.StoreTwo;

public class Main {
    public static void main(String[] args) {


        Store firstStore = new StoreOne();

        Store secondStore = new StoreTwo();

        Product productOne = firstStore.orderProduct("one");
        System.out.println("\nFirst Product is Ready! "+productOne.getCode()+"\n\n");
        Product productTwo = secondStore.orderProduct("two");
        System.out.println("\nSecond Product is Ready! "+productTwo.getCode()+"\n\n");

    }
}
import interfaces.IProduct;
import model.BasicProduct;
import model.ProductOne;

public class Main {
    public static void main(String[] args) {

        IProduct basicProduct = new BasicProduct();
        System.out.println("Basic Product cost: "+ basicProduct.cost());
        //Creating inheritance through decorator
        IProduct productOne = new ProductOne(basicProduct); //wrapping the basic product through decorator
        System.out.println("Product one cost: "+ productOne.cost());
    }
}
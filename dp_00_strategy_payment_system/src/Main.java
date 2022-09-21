import controller.CreditCardAlgorithm;
import controller.PaypalAlgorithm;
import controller.ShoppingCart;
import model.Product;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("978", 32);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        //decide
        cart.pay(new PaypalAlgorithm("paulo@build.com","123-123"));
        cart.pay(new CreditCardAlgorithm("Paulo","2317237"));
    }
}
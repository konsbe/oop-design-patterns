package interfaces;
import model.Product;
public abstract class Store {
    public Product orderProduct(String type){
        Product product;
        product = (Product) createProduct(type);
        product.prepare();
        product.ready();
        product.box();

        return product;

    }
    abstract public Object createProduct(String type);
}

package decorator;

import interfaces.IProduct;

public class ProductDecorator implements IProduct {
    private IProduct product;
    public ProductDecorator(IProduct product){
        this.product = product;
    }
    @Override
    public double cost(){
        return this.product.cost();
    }
}

package model;

import decorator.ProductDecorator;
import interfaces.IProduct;

public class ProductOne extends ProductDecorator {

    public ProductOne(IProduct product) {
        super(product);
    }

    @Override
    public double cost() {
        System.out.println("adding the first product");
        return 1 + super.cost();
    }
}

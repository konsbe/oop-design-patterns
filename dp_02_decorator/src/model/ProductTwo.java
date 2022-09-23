package model;

import decorator.ProductDecorator;
import interfaces.IProduct;

public class ProductTwo extends ProductDecorator {
    public ProductTwo(IProduct product) {
        super(product);
    }

    @Override
    public double cost() {
        System.out.println("adding the second product");
        return 2 + super.cost();
    }
}

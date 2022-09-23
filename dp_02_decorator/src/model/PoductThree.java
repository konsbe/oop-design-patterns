package model;

import decorator.ProductDecorator;
import interfaces.IProduct;

public class PoductThree extends ProductDecorator {
    public PoductThree(IProduct product) {
        super(product);
    }

    @Override
    public double cost() {
        System.out.println("adding the third product");
        return 3+ super.cost();
    }
}

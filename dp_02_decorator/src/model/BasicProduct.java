package model;

import interfaces.IProduct;

public class BasicProduct implements IProduct {
    public BasicProduct(){
        System.out.println("Create a basic product");
    }
    @Override
    public double cost() {
        return 0.5;
    }
}

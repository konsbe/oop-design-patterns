package model;

import interfaces.IProduct;

public abstract class Product implements IProduct {
    public String name;
    public String code;

    @Override public void prepare() {
        System.out.println("preparing " + name);
    }

    @Override public void ready() {
        System.out.println("ready! ");
    }

    @Override public void box() {
        System.out.println("box " + code);
    }

    @Override public String getName() {
        return name;
    }

    @Override public String getCode() {
        return code;
    }
}

package submodels;

import model.Product;

public class SubModelOne extends Product {

    public SubModelOne(String n, String c) {
        name = n;
        code =c;
    }

    @Override
    public void ready() {
        super.ready();
        System.out.println("Sub Model #1");
    }
}

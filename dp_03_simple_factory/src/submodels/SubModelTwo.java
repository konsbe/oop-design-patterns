package submodels;

import model.Product;

public class SubModelTwo extends Product {
    public SubModelTwo(String n, String c) {
        name=n;
        code=c;
    }
    @Override
    public void ready() {
        super.ready();
        System.out.println("Sub Model #1");
    }
}

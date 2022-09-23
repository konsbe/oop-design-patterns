package model;

import interfaces.Store;
import submodels.SubModelOne;
import submodels.SubModelTwo;

public class StoreTwo extends Store {
    @Override
    public Object createProduct(String type) {
        return type.equals("one") ? new SubModelOne("one","#one") : type.equals("two") ? new SubModelTwo("two","#two") : null;
    }
}

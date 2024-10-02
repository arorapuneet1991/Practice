package interview.designpatterns.creational.factorymethod.creator;

import interview.designpatterns.creational.factorymethod.product.AndroidPhone;
import interview.designpatterns.creational.factorymethod.product.MobilePhone;

public class AndroidMobileFactory implements IMobileFactory {
    @Override
    public MobilePhone getMobile() {
        return new AndroidPhone();
    }
}

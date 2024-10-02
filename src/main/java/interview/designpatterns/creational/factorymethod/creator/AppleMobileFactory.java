package interview.designpatterns.creational.factorymethod.creator;

import interview.designpatterns.creational.factorymethod.product.ApplePhone;
import interview.designpatterns.creational.factorymethod.product.MobilePhone;

//
public class AppleMobileFactory implements IMobileFactory {

    @Override
    public MobilePhone getMobile() {
        return new ApplePhone();
    }
}

package interview.designPatterns.creational.factorymethod.creator;

import interview.designPatterns.creational.factorymethod.product.ApplePhone;
import interview.designPatterns.creational.factorymethod.product.MobilePhone;

//
public class AppleMobileFactory implements IMobileFactory {

    @Override
    public MobilePhone getMobile() {
        return new ApplePhone();
    }
}

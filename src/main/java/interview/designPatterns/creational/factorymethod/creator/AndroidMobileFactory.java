package interview.designPatterns.creational.factorymethod.creator;

import interview.designPatterns.creational.factorymethod.product.AndroidPhone;
import interview.designPatterns.creational.factorymethod.product.MobilePhone;

public class AndroidMobileFactory implements IMobileFactory {
    @Override
    public MobilePhone getMobile() {
        return new AndroidPhone();
    }
}

package interview.designPatterns.creational.abstractfactory.creator;

import interview.designPatterns.creational.abstractfactory.product.os.AndroidOS;
import interview.designPatterns.creational.abstractfactory.product.os.IOperatingSystem;
import interview.designPatterns.creational.abstractfactory.product.phone.AndroidPhone;
import interview.designPatterns.creational.abstractfactory.product.phone.MobilePhone;

public class AndroidMobileFactory implements IMobileFactory {
    @Override
    public MobilePhone getMobile() {
        return new AndroidPhone();
    }

    @Override
    public IOperatingSystem getOS() {
        return new AndroidOS();
    }
}

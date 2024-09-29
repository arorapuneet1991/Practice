package interview.designPatterns.creational.abstractfactory.creator;

import interview.designPatterns.creational.abstractfactory.product.os.IOperatingSystem;
import interview.designPatterns.creational.abstractfactory.product.os.iphoneOS;
import interview.designPatterns.creational.abstractfactory.product.phone.ApplePhone;
import interview.designPatterns.creational.abstractfactory.product.phone.MobilePhone;

//
public class AppleMobileFactory implements IMobileFactory {

    @Override
    public MobilePhone getMobile() {
        return new ApplePhone();
    }

    @Override
    public IOperatingSystem getOS() {
        return new iphoneOS();
    }
}

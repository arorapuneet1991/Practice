package interview.designpatterns.creational.abstractfactory.creator;

import interview.designpatterns.creational.abstractfactory.product.os.IOperatingSystem;
import interview.designpatterns.creational.abstractfactory.product.os.iphoneOS;
import interview.designpatterns.creational.abstractfactory.product.phone.ApplePhone;
import interview.designpatterns.creational.abstractfactory.product.phone.MobilePhone;

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

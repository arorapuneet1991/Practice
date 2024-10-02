package interview.designpatterns.creational.abstractfactory.creator;

import interview.designpatterns.creational.abstractfactory.product.os.AndroidOS;
import interview.designpatterns.creational.abstractfactory.product.os.IOperatingSystem;
import interview.designpatterns.creational.abstractfactory.product.phone.AndroidPhone;
import interview.designpatterns.creational.abstractfactory.product.phone.MobilePhone;

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

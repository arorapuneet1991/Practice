package interview.designpatterns.creational.abstractfactory.creator;

import interview.designpatterns.creational.abstractfactory.product.os.IOperatingSystem;
import interview.designpatterns.creational.abstractfactory.product.phone.MobilePhone;

// this is the base creator of the factory pattern
public interface IMobileFactory {
    MobilePhone getMobile();
    IOperatingSystem getOS();
}

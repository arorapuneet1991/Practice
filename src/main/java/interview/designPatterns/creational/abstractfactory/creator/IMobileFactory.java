package interview.designPatterns.creational.abstractfactory.creator;

import interview.designPatterns.creational.abstractfactory.product.os.IOperatingSystem;
import interview.designPatterns.creational.abstractfactory.product.phone.MobilePhone;

// this is the base creator of the factory pattern
public interface IMobileFactory {
    MobilePhone getMobile();
    IOperatingSystem getOS();
}

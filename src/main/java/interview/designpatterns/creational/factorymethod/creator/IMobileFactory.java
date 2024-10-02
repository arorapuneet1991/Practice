package interview.designpatterns.creational.factorymethod.creator;

import interview.designpatterns.creational.factorymethod.product.MobilePhone;

// this is the base creator of the factory pattern
public interface IMobileFactory {
    MobilePhone getMobile();
}

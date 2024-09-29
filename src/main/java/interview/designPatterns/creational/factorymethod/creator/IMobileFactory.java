package interview.designPatterns.creational.factorymethod.creator;

import interview.designPatterns.creational.factorymethod.product.MobilePhone;

// this is the base creator of the factory pattern
public interface IMobileFactory {
    MobilePhone getMobile();
}

package interview.designPatterns.creational.factorymethod.client;

import interview.designPatterns.creational.factorymethod.creator.AndroidMobileFactory;
import interview.designPatterns.creational.factorymethod.creator.AppleMobileFactory;
import interview.designPatterns.creational.factorymethod.product.MobilePhone;

public class Client {
    public static MobilePhone mobilePhone;

    public static void main(String[] args) {
        String phoneType = "Apple";

        if (phoneType.equals("Android"))
            mobilePhone = new AndroidMobileFactory().getMobile();
        else if (phoneType.equals("Apple"))
            mobilePhone = new AppleMobileFactory().getMobile();

        mobilePhone.display();
    }

}

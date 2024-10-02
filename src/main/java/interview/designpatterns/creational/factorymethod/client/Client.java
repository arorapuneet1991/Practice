package interview.designpatterns.creational.factorymethod.client;

import interview.designpatterns.creational.factorymethod.creator.AndroidMobileFactory;
import interview.designpatterns.creational.factorymethod.creator.AppleMobileFactory;
import interview.designpatterns.creational.factorymethod.product.MobilePhone;

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

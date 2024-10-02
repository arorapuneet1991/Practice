package interview.designpatterns.creational.abstractfactory.client;

import interview.designpatterns.creational.abstractfactory.creator.AndroidMobileFactory;
import interview.designpatterns.creational.abstractfactory.creator.AppleMobileFactory;
import interview.designpatterns.creational.abstractfactory.creator.IMobileFactory;
import interview.designpatterns.creational.abstractfactory.product.os.IOperatingSystem;
import interview.designpatterns.creational.abstractfactory.product.phone.MobilePhone;

public class Client {
    public static MobilePhone mobilePhone;
    public static IOperatingSystem operatingSystem;
    public static IMobileFactory mobileFactory;

    public static void main(String[] args) {
        String phoneType = "Android";

        if (phoneType.equals("Android")) {
            mobileFactory = new AndroidMobileFactory();
            mobilePhone = mobileFactory.getMobile();
            operatingSystem = mobileFactory.getOS();
        } else if (phoneType.equals("Apple")) {
            mobileFactory = new AppleMobileFactory();
            mobilePhone = mobileFactory.getMobile();
            operatingSystem = mobileFactory.getOS();
        }
        mobilePhone.display();
        operatingSystem.displayOS();
    }

}

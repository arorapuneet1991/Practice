package interview.designpatterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        LoggingProxy loggingProxy = new LoggingProxy(new BillingServiceImpl());
        loggingProxy.serviceDelivery();

        LoggingProxy loggingProxy2 = new LoggingProxy(new BillingServiceImpl());
        loggingProxy2.serviceDelivery();
        System.out.println(loggingProxy.requestorLogger);
    }
}

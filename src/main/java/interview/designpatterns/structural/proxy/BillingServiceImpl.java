package interview.designpatterns.structural.proxy;

public class BillingServiceImpl implements IBillingService {
    @Override
    public void serviceDelivery() {
        System.out.println("Service is delivered");
    }
}

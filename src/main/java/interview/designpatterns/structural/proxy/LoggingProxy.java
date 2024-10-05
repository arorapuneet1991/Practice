package interview.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class LoggingProxy implements IBillingService {
    IBillingService billingService;
    static List<String> requestorLogger = new ArrayList<>();

    public LoggingProxy(IBillingService billingService) {
        this.billingService = billingService;

    }

    @Override
    public void serviceDelivery() {
        requestorLogger.add(this.billingService.toString());
        this.billingService.serviceDelivery();

    }
}

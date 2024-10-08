package interview.designpatterns.behavioral.chainofresponsibility;

public class TakeLoginCreds implements LoginHandler {
    private LoginHandler loginHandler;

    @Override
    public void handleLoginRequest(LoginRequest request) {
        System.out.println(request.userName+" request received - to verify now");
        this.loginHandler.handleLoginRequest(request);
    }

    @Override
    public void setNextHandler(LoginHandler handler) {
        this.loginHandler = handler;

    }
}

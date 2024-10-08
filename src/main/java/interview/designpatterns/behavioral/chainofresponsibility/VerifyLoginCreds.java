package interview.designpatterns.behavioral.chainofresponsibility;

public class VerifyLoginCreds implements LoginHandler {
    LoginHandler handler;

    @Override
    public void handleLoginRequest(LoginRequest request) {
        if (request.password.equals("correct")) {
            System.out.println(request.userName + " right pwd - verifying authorization");
            this.handler.handleLoginRequest(request);
        } else
            System.out.println("Wrong pwd");
    }

    @Override
    public void setNextHandler(LoginHandler handler) {
        this.handler = handler;
    }
}

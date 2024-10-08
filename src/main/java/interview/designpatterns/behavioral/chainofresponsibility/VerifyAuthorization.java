package interview.designpatterns.behavioral.chainofresponsibility;

public class VerifyAuthorization implements LoginHandler {
    LoginHandler handler;

    @Override
    public void handleLoginRequest(LoginRequest request) {
        if (request.authorized == true) {
            System.out.println(request.userName + " authorized");
        } else
            System.out.println(request.userName + " NOT authorized");

    }

    @Override
    public void setNextHandler(LoginHandler handler) {
        this.handler = handler;
    }
}

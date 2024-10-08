package interview.designpatterns.behavioral.chainofresponsibility;

public interface LoginHandler {
    void handleLoginRequest(LoginRequest request);

    void setNextHandler(LoginHandler handler);
}

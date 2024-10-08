package interview.designpatterns.behavioral.chainofresponsibility;

public class LoginRequest {
    String userName;
    String password;
    boolean authorized;

    public LoginRequest(String userName, String password, boolean authorized) {
        this.userName = userName;
        this.password = password;
        this.authorized = authorized;
    }
}

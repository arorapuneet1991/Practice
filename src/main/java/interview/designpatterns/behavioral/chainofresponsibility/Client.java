package interview.designpatterns.behavioral.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        LoginRequest firstLoginRequest = new LoginRequest("User1", "correct", true);
        LoginRequest secondLoginRequest = new LoginRequest("User2", "correct", false);
        LoginRequest thirdLoginRequest = new LoginRequest("User3", "incorrect", true);

        LoginHandler takeLoginCreds = new TakeLoginCreds();
        LoginHandler verifyLoginCreds = new VerifyLoginCreds();
        LoginHandler verifyAuthorization = new VerifyAuthorization();

        takeLoginCreds.setNextHandler(verifyLoginCreds);
        verifyLoginCreds.setNextHandler(verifyAuthorization);

        takeLoginCreds.handleLoginRequest(firstLoginRequest);
        takeLoginCreds.handleLoginRequest(secondLoginRequest);
        takeLoginCreds.handleLoginRequest(thirdLoginRequest);
    }
}

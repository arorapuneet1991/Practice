package interview.coding.java.exception.example;

public class Client {
    public static void main(String[] args) throws MyCustomException {
        throw new MyCustomException("Oops");
    }
}

package interview.coding.java.advanced.lambdaexample;

public class LambdaExample {
    public static void main(String[] args) {
        ILambdaInterface lambdaInterface = (z) -> z + 2;
        System.out.println(lambdaInterface.myMethod(9));
    }
}
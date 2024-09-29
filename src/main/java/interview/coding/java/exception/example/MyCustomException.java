package interview.coding.java.exception.example;

public class MyCustomException extends Exception{
    public MyCustomException(String str){
        System.out.println(str);
    }
}

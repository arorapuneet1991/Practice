package interview.coding.java.numbers;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int temp=0;
        for(int i=0;i<5;i++){
            System.out.println(a+b);
            temp=a;
            a=b;
            b=a+temp;
        }
    }
}

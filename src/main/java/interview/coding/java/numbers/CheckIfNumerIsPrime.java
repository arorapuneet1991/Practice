package interview.coding.java.numbers;

public class CheckIfNumerIsPrime {
    public static void main(String[] args) {
        int num = 6;

        int flag = 0;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }

        System.out.println(flag);
    }
}

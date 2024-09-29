package interview.coding.java.numbers;

import java.util.ArrayList;
import java.util.List;

public class NunberToDigits {
    public static void main(String[] args) {
        int num = 987;

        List<Integer> numList = new ArrayList<>();
        while (num > 10) {
            numList.add(num%10);
            num=num/10;
        }
        numList.add(num);
        System.out.println(numList);
    }
}

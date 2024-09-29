package interview.coding.java.numbers;

public class SecondLargestValue {
    public static void main(String[] args) {
        int[] arrayName = {3, 5, 7, 6, 9, 1};

        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] > max) {
                secondMax = max;
                max = arrayName[i];
            }
            else if (arrayName[i] < max && arrayName[i] > secondMax){
                secondMax = arrayName[i];
            }
        }

        System.out.printf(secondMax+"");
    }
}

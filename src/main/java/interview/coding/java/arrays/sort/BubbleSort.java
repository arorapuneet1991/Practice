package interview.coding.java.arrays.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 9, 2};
        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] > arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

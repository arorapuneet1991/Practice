package interview.coding.java.arrays.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 1, 9, 8};

        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println((arr[i]));
        }

    }
}

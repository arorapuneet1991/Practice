package interview.coding.java.arrays.other;

public class RotateAnArray {
    public static void main(String args[]) {
        int[] arr = {4, 5, 3, 1, 2};
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
            System.out.print(arr[i]);
        }


        int k = 2;

        int[] firstPart = new int[arr.length - k];

        for (int i = 0; i < arr.length  - k; i++) {
            firstPart[i] = arr[i];
        }
        for (int i = 0; i < arr.length - k; i++) {
            System.out.print(firstPart[i]);
        }


        int[] secondPart = new int[arr.length - (arr.length - k)];
        int j=0;
        for (int i = arr.length - k; i <= arr.length - 1; i++) {
            secondPart[j] = arr[i];
            j++;
        }


        for (int i = 0; i < secondPart.length; i++) {

            System.out.print(secondPart[i]);
        }
    }
}

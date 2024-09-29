package interview.coding.java.arrays.other;

public class RemoveItems {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int remove = 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == remove) {
                arr[i] = -1;
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == -1)) {
                System.out.print(arr[i]);
            }
        }

        for (int i = 0; i <count; i++) {
                System.out.print("_");
        }
    }
}

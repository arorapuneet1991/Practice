package interview.coding.java.numbers;

public class SecondLargest {
    public String getMinMax(int[] a) {
        if (a.length < 2) {
            return "too few numbers";
        } else {
            int max = -1, secondMax = -1;

            for (int i = 0; i < a.length; i++) {
                if (a[i] > max && a[i] > secondMax) {
                    secondMax = max;
                    max = a[i];

                } else if (a[i] < max && a[i] > secondMax) {
                    secondMax = a[i];
                }
            }

            return max + " " + secondMax;
        }
    }

    public static void main(String[] args) {
        //int[] a = {1, 4, 5, 2, 3, 7};
        //int[] a = {1, 4};
        int[] a = {1};
        SecondLargest secondLargest = new SecondLargest();
        System.out.println(secondLargest.getMinMax(a));
    }
}

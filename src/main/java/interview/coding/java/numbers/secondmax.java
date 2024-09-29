package interview.coding.java.numbers;

public class secondmax {
    public static void main(String[] args) {
        int[] abc = {1, 4, 7, 3, 8, 3, 6};

        int max = 0;
        int secmax = 0;

        for (int i = 0; i < abc.length-1; i++) {
            for (int j = i + 1; j < abc.length; j++) {
                if (abc[i] > max) {
                    secmax = max;
                    max = abc[i];

                } else if (abc[i] > secmax && (abc[i] < max)) {
                    secmax = abc[i];
                }


            }
        }

        System.out.println(secmax);
    }
}

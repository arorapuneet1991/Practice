package interview.coding.java.arrays.other;

import java.util.HashMap;
import java.util.Map;

public class CountEachNumberInArray {
    public static void main(String[] args) {
        int[] arrayName = {3, 3, 7, 6, 9, 1};

        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < arrayName.length; i++) {
            if (myMap.containsKey(arrayName[i])) {
                myMap.put(arrayName[i], myMap.get(arrayName[i]) + 1);
            } else
                myMap.put(arrayName[i], 1);
        }

        System.out.println(myMap);

        int max = 0;
        int maxKey=0;
        for (Map.Entry<Integer, Integer> x : myMap.entrySet()) {
            if (x.getValue() > max) {
                max = x.getValue();
                maxKey=x.getKey();
            }
        }

        System.out.println(maxKey);
    }
}

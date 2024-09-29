package interview.coding.java.strings;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateChars {
    public static void main(String[] args) {
        String str = "AbaBcde";

        str = str.toLowerCase();

        Map<Character, Integer> myMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (myMap.containsKey(str.charAt(i)))
                myMap.put(str.charAt(i), myMap.get(str.charAt(i)) + 1);
            else
                myMap.put(str.charAt(i), 1);
        }


        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

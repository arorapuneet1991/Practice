package interview.coding.java.strings;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterInString {
    public static void main(String[] args) {
        String str = "Puneet";

        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!myMap.containsKey(str.charAt(i))) {
                myMap.put(str.charAt(i), 1);
            } else {
                myMap.put(str.charAt(i), myMap.get(str.charAt(i)) + 1);
            }
        }

        System.out.println(myMap);
    }
}

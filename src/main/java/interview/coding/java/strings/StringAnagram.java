package interview.coding.java.strings;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {
    public static void main(String[] args) {
        StringAnagram stringAnagram = new StringAnagram();
        System.out.println(stringAnagram.isAnagram("Aet".toLowerCase(), "tar".toLowerCase()));
    }

    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        else if (str1.equals(str2))
            return true;
        else {
            Map<Character, Integer> first = new HashMap<>();
            Map<Character, Integer> second = new HashMap<>();

            for (int i = 0; i < str1.length(); i++) {
                if (first.containsKey((Character) str1.charAt(i)))
                    first.put(str1.charAt(i), first.get(str1.charAt(i)));
                else
                    first.put(str1.charAt(i), 1);

                if (second.containsKey((Character) str2.charAt(i)))
                    second.put(str2.charAt(i), second.get(str2.charAt(i)));
                else
                    second.put(str2.charAt(i), 1);
            }
            return first.equals(second);
        }

    }
}

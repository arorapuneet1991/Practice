package interview.coding.java.strings;

import java.util.*;

public class SplitStringOnSpaces {
    public static void main(String[] args) {
        String str="Puneet  Arora";
        String[] spliter=str.split(" ");
        List<String> list= new ArrayList<>(Arrays.asList(spliter));
        list.remove("");
        System.out.println(list);


    }
}

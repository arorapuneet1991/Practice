package interview.coding.java.strings;

import java.util.HashMap;

public class MostValuesString {
    public static void main(String[] args) {
        String str="cat tree cat dog car cat tree";
        str=str.toLowerCase();

        HashMap<String, Integer> myMap=new HashMap<>();

        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(myMap.containsKey(arr[i])){
                myMap.put(arr[i],myMap.get(arr[i])+1);
            }
            else {
                myMap.put(arr[i],1);
            }
        }


        System.out.println(myMap);
    }
}

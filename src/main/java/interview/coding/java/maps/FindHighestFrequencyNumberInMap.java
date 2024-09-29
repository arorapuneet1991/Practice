package interview.coding.java.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindHighestFrequencyNumberInMap {
    public static void main(String[] args) {
        Map<Integer,Integer> myMap=new HashMap<>();
        myMap.put(1,1);
        myMap.put(2,1);
        myMap.put(3,2);
        myMap.put(4,1);
        myMap.put(5,2);
        myMap.put(6,3);
        System.out.println(myMap);

        TreeMap<Integer,Integer> map=new TreeMap();

        for(int key:myMap.values()){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else {
                map.put(key,1);
            }
        }
        System.out.println(map.lastEntry());
        map.lastEntry();
    }
}

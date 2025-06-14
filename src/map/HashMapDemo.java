package src.map;

import java.util.HashMap;
import java.util.Map;

/**
 * key ,value
 * 1 -> John
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // diamond operator
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"John");
        map.put(2,"Michael");
        map.put(null,"Null");
        map.put(5,null);
        String don = map.put(3, "Don");
        System.out.println(map.put(4, "Ben"));
        System.out.println("Key : "+map.keySet() + " Value : "+map.values() );
        System.out.println(map.getOrDefault(4,"Not Found"));
    }
}
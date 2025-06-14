package src.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Ram -> 2
 * Shyam -> 1
 */
public class WordCount {
    public static void main(String[] args) {
        String[] str = {"Ram", "Mohan","Ram","Mohan","Shyam", "Ganga"};
        Map<String,Integer> wordMap = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if(wordMap.containsKey(str[i])) {
                int i1 = wordMap.get(str[i]) + 1;
                wordMap.put(str[i],i1);
            } else {
                wordMap.put(str[i],1);
            }
        }
        System.out.println(wordMap);
    }
}
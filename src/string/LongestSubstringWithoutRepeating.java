package src.string;
// IMP Longest Substring Without Repeating Characters
import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLen = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            if (charIndexMap.containsKey(current)) {
                start = Math.max(start, charIndexMap.get(current) + 1);
            }
            charIndexMap.put(current, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}

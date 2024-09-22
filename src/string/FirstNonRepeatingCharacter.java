package src.string;
// IMP Find the First Non-Repeating Character
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public Character firstNonRepeating(String s) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return null;
    }
}

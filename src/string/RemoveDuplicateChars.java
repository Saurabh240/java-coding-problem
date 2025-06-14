package src.string;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String s = "madam";
        //mad
        StringBuilder sb = new StringBuilder();
        // sb =""
        char[] c = s.toCharArray();
        // Set Set<Character> charSet = new LinkedHashSet<>();
        // index of returns the index of character when present and it returns -1 when not present
        for (int i=0;i<s.length();i++) {
            if(sb.indexOf(String.valueOf(s.charAt(i))) == -1) { // we are checking the unique char and add them
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}

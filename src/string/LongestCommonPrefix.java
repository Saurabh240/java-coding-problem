package src.string;
//IMP Find the Longest Common Prefix
public class LongestCommonPrefix {
    //Using Horizontal Scanning
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println("Longest Common prefix is "+longestCommonPrefix(new String[]{"bro","brother","broom"}));
    }
/*
Using Vertical Scanning

public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length() ; i++){
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j ++) {
            if (i == strs[j].length() || strs[j].charAt(i) != c)
                return strs[0].substring(0, i);
        }
    }
    return strs[0];
}

Using the Character Array

public static String longestCommonPrefix(String str[]) {
    	if(str==null) return null;
    	if(str.length==0) return "";
    	Arrays.sort(str);
    	char[] first = str[0].toCharArray();
    	char[] last = str[str.length-1].toCharArray();

    	int i=0 , len = Math.min(first.length, last.length);
    	while(i<len && (first[i] == last[i]))  i++;

    	return str[0].substring(0,i);
    }
*/
}

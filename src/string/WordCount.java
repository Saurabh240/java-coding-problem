package src.string;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) {
        String s = "This,is,a,Pallindrome";
        String[] s1 = s.split(",");
        System.out.println(Arrays.toString(s1));
        System.out.println(s1.length);

        int count =0;
        for (int i=0;i<s.length();i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        if(count!=0) {
            count++;
        }
        System.out.println(count);
    }
}

package src.string;

public class ReverseCharStringTwoPointer {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
    public static void main(String[] args) {
        char[] chars = {'h', 'o', 't', 'e', 'l'};
        reverseString(chars);
        System.out.println(chars);
    }
}

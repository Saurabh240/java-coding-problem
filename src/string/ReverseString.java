package src.string;
// IMP Reverse a String
public class ReverseString {
    public static void main(String[] args) {
        String s = "madama";
        String revStr = "";
//        StringBuilder sb = new StringBuilder(s);
//        System.out.println(sb.reverse());

        for (int i=s.length()-1;i>=0;i--) {
            revStr+=s.charAt(i); // a+m+a+d+a+m
        }
        System.out.println(revStr);
        if(s.equals(revStr)) {
            System.out.println("This is Pallindrom");
        } else {
            System.out.println("This is not a Pallindrom");
        }

    }
}

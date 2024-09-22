package src.string;
// IMP Reverse a String
public class ReverseString {
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

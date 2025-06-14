package src.basic.condition;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // condition ? value 1 : value 2

        String s = a > b ? "a less than b" : "a greater than b";
//        if(a>b) {
//            System.out.println("a less than b");
//        } else {
//            System.out.println("a greater than b");
//        }
        System.out.println(s);
    }
}

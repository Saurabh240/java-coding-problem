package src.basic.operator;

/*
 ++a Pre increment operator
 --a Pre decrement operator
 a++ Post increment operator
 a-- Post decrement operator
 */
public class IncDecOperator {
    public static void main(String[] args) {
        int a = 5;
//          a++; // a=a+1
        System.out.println(a--);
        System.out.println(a);
    }
}
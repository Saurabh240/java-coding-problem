package src.basic.loops;

public class ForLoopDemo {
    public static void main(String[] args) {
        /*
        for (initialization ; condition ; increment/decrement)
        ++i ->
        i++ ->
        i 1
        i 2

        i 10
         */
        for (int i=1; i<=10;++i) {
            System.out.println("i " + ++i);
        }
    }
}
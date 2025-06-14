package src.basic.condition;

public class BreakContinueDemo {
    public static void main(String[] args) {
        // break dicontinue the iteration
        // continue skip a iteration
        for (int i=0;i<=10;i++) {
            if(i==5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
package src.basic.pattern;

/*
 * * * * *
 * * * *
 * * *
 * *
 *
 */
public class Pattern3 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++) { //i = 5
            for (int j=i;j<=5;j++) { // j=5
                System.out.print("* "); // *
            }
            System.out.println();
        }
    }
}
package src.basic.scanner;

import java.util.Scanner;

public class ScannerDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scanner.nextInt();
        int firstTerm =0 , secondTerm =1;
        System.out.print("Fibonacci Series "+firstTerm + " , " + secondTerm);
        for (int i=3;i<=num;i++) {
            int nextTerm = firstTerm+secondTerm;
            System.out.print(" , "+nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

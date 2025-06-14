package src.basic.scanner;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int sum = num*(num+1)/2;
        System.out.println("Sum of the first "+num + " natural number is "+sum);
    }
}

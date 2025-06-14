package src.basic.scanner;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scanner.nextInt();

        int reverse = 0;
        while (num!=0) { //num = 1
            int digit = num % 10; // digit = 1
            reverse = reverse*10+digit; //reverse = 32*10+1 = 321
            num = num / 10; // num = 0
        }
        System.out.println("Reverse number is : "+reverse);
    }
}

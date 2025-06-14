package src.basic.scanner;

import java.util.Scanner;

public class ScannerDemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scanner.nextInt();
        int originalNum = num;
        int digits  = String.valueOf(num).length();
        int sum = 0;

        while (num!=0) {
            int digit = num % 10;
            sum += Math.pow(digit,digits);
            num /= 10;
        }
        System.out.println("Sum is "+sum);

        if(sum == originalNum) {
            System.out.println("Its an armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}

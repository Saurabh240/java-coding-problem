package src.math;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        int temp =n;
        int count=count(n);
        int sum=0;
        while(n!=0) {
            int last =n%10;
            sum=sum+ power(last,count);
            n=n/10;
        }
        if(sum==temp) {
            System.out.println("yes");
        }
        else {
            System.out.println("noo");
        }
    }
    public static int count(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int power(int m, int n) {

        int power=1;
        for(int i=1;i<=n;i++) {
            power=power*m;
        }
        return power;
    }
}

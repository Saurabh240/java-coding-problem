package src.string;

public class ReverseInteger {
    public static int reverse(int x) {
        int rev=0;
        while(x!=0){
            int pop=x%10;
            x=x/10;
            if((rev <= ((Math.pow(2,31)-1)- pop)/10) && (rev >= ((Math.pow(-2,31)-pop)/10))){
                rev=rev*10+pop;
                continue;
            }else{
                return 0;
            }
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse(26));
    }
}

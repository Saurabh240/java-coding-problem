package src.math;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int a =0;
        for(int i:nums) {
            a^=i;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,1,3,3,2}));
    }
}

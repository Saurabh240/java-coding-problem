package src.array;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);
    }
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0)
                sum = nums[i];
            else
                sum += nums[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }
}

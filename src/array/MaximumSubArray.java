package src.array;
// IMP Maximum Subarray (LeetCode #53)
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
    /*
        public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
       }
     */
}

package src.array;

public class RemoveDuplicateUsingTwoPointers {
    public static void main(String[] args) {
      int[] nums = {1,2,3,3,4,4,5,6};
        int removedDuplicates = removeDuplicates(nums);
        System.out.println(removedDuplicates);
    }
    public static int removeDuplicates(int[] nums) {
        int i=0;
        if(nums.length==0) return 0;
        for(int j=1; j < nums.length; j++) {
            if(nums[i]!=nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}

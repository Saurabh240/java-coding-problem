package src.array;
//IMP Two Sum (LeetCode #1)
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * [2,7,11,15]
 * target = 13
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        // map(k,v)
        int target = 22;
        System.out.println(Arrays.toString(twoSum(arr, target)));;
    }

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> twoSumMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target-arr[i];
            // (K,V) -> (2,0) , (7,1) ,(11,2) , (15,3)
            if (twoSumMap.containsKey(complement)) {
                return new int[]{twoSumMap.get(complement) ,i};
            }
            twoSumMap.put(arr[i],i);
        }

        return new int[]{};
    }

//    public static int[] twoSum(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j=i+1;j < arr.length;j++) {
//                if(target == arr[i]+arr[j]) {
//                    return new int[]{i,j};
//                }
//            }
//        } // Time Complexity O(n2)
//        return new int[]{0,0};
//    }
}

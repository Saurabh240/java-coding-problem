package src.set;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicates {

    public static boolean checkDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x: nums) {
            if(set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Is contains Duplicates "+checkDuplicate(new int[]{1,2,2,4,5}));
    }
}

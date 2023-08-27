package array;

import java.util.Arrays;

/**
 * {0,1,0,3,12}
 * {1,3,12,0,0}
 */
public class MoveZeros {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        int lastNonZeroIndex = 0;
        for (int i = 0; i <arr.length ; i++) {
            //swap the variable at i and i+1 if arr[i] == 0
            if(arr[i]!=0) {
                arr[lastNonZeroIndex++] = arr[i];
            }
        }

        for (int i=lastNonZeroIndex;i<arr.length;i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

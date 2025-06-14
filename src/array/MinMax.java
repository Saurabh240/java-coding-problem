package src.array;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,9,2,8};
        int min = arr[0];
        int max = arr[0];
        System.out.println("Min Value is : "+ getMin(arr, min));
        System.out.println("Max Value is : " + getMax(arr, max));
    }

    private static int getMax(int[] arr, int max) {
        for (int i = 0; i< arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int getMin(int[] arr, int min) {
        for (int i = 0; i< arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}

/**
 * 1 iteration  (min = 0 , i=0 , i<7 , 0<arr[0] -> 0 < 1 -> min =1 )
 * 2 iteration (min = 1, i=1 , i<7 , 1<arr[1) -> 1<5 -> min =5 )
 *
 *  * 1 iteration  (max = 0 , i=0 , i<7 , 0<arr[0] -> 0 < 1 -> max =1 )
 *  * 2 iteration (max = 1, i=1 , i<7 , 1<arr[1) -> 1<5 -> max =5 )
 */

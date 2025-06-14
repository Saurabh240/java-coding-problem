package src.array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,98,43};
        int firstMax=arr[0];
        int secondMax=arr[0];
        for (int i=0;i<arr.length;i++) {
            if(arr[i]>firstMax) {
                firstMax = arr[i];
            }
        }
        for (int i=0;i<arr.length;i++) {
            if(arr[i]>secondMax && arr[i]<firstMax) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}

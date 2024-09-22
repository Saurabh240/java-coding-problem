package src.array;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int peakIndexInMountainArray = peakIndexInMountainArray(arr);
        System.out.println(peakIndexInMountainArray);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1])
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}

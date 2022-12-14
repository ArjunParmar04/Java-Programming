package Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 0, 6, 3, 7, 9};
        System.out.println(min(arr));
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 6));
    }

    static int min(int[] arr) {
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int start, int end) {
        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}

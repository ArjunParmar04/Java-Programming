import javax.lang.model.util.ElementScanner14;

public class Ceailing {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 18, 19, 21, 26};
        int ans = ceailing(arr, 18);
        System.out.println(ans);
    }


    //returns the smallest no of >= target
    public static int ceailing(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;

    }
}

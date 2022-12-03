package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 4, 9, 12, 15, 13};
        int max1 = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("Second Largest Element is : " + max2);
    }
}

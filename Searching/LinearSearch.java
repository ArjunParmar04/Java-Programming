package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 9, 1, 6, 12, 16, 13};
        int ans = ls(arr, 6);
        System.out.println(ans);
    }

    //for return an index
    static int ls(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //for return element
    static int ls2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    //for return true or false
    static boolean ls3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int j : arr) {
            if (j == target) {
                return true;
            }
        }
        return false;
    }
}

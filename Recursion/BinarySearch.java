package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,8,12,15,17,18,23,25,28};
        System.out.println(search(arr, 25, 0, arr.length -1));
    }

    static int search(int[] arr, int target, int s, int e){
        int m = s + (e - s) / 2;

        if(s > e){
            return -1;
        }
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr, target, s, m - 1);
        }

        return search(arr, target, m + 1, e); 
    }
}

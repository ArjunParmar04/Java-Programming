package Searching;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 7, 2, 8, 1};
        System.out.println(search(arr,1,4,1));
    }
    static boolean search(int[] arr, int start, int end, int target){
        if (arr.length == 0){
            return false;
        }

        for (int i = start; i <= end; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }
}

package Searching;

import java.util.Arrays;
public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {{23,4,2},
                {18,12,11,9},
                {13,14,19,1},
                {22,29,30,15,20}
        };
        int[] ans = search(arr,11);
//        System.out.println(Arrays.toString(ans));
        System.out.println(searchMax(arr));
    }
    
    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int searchMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}

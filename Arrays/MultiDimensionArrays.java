package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArrays {
    public static void main(String[] args) {
//        int[][] arr = new int[3][];

//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(arr[0][1]);

        int[][] arr = new int[3][3];

        Scanner in = new Scanner(System.in);
        //for rows
        for (int row = 0; row < arr.length; row++) {
            //for columns
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = in.nextInt();
            }
        }

//        System.out.println(Arrays.toString(arr));

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}

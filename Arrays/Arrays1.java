package Arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        //declaration..
//        int[] arr;//declaration of array. arr is getting defined in the stack
//        arr = new int[5];//Initialization.. //Actually here object is being created in the memory(heap)..

        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


        //direct initialization..
//        int[] arr1 = {};
//        System.out.println(arr[2]);


    }

    //Arrays are mutable in java
    static void change(int[] arr) {
        arr[0] = 9;
    }
}

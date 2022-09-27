package day29_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

         /*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
    [1, 2, 3, 4, 5]
    Output:
    [5, 4, 3, 2, 1]
     */

        int [] arr = {1, 2, 3, 4, 5};
        int [] reverse = new int[arr.length];

       for (int i = arr.length - 1, j = 0; i >= 0; i--, j++){
            System.out.println(arr[i]);
            reverse[j] = arr[i];
            }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse));


        // exam 2
        /* for (int i = 0; i < arr.length; i++){
            reverse[arr.length -1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse)); */


        // i = 0
        // reverse[arr.length -1 - i] = arr[i];
        // reverse[5 -1 - 0] = arr[0];
        // reverse[4] = arr[0];


        // i =1
        // reverse[arr.length -1 - i] = arr[i];
        // reverse[5 -1 - 1] = arr[1];
        //reverse[3] = arr[1];

        // i =1
        // reverse[arr.length -1 - i] = arr[i];
        // reverse[5 -1 - 2] = arr[2];
        //reverse[2] = arr[2];















    }
}

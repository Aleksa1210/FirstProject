package day32_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {


        int [] nums = {4, 10, 30, 100};
        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 100)); // like indexOf
        System.out.println(Arrays.binarySearch(nums, 6)); // we don't have such number, would be in position = 1, so 1+1 = 2 and negative because it was in the array so -2 (+1 to the position)













    }
}

package day35_methods;


import java.util.Arrays;

public class MainNumberInArray {



    /* Min Number
create a method that will accept an int array and return the smallest number from the array
     */

public static int minNumber (int [] nums){
    int min = nums[0];

    for (int num : nums){
        if (num < min){
            min = num;
        }
    }
    return min;
}

    public static int minNumberSort (int [] nums){  // second way
    Arrays.sort(nums);
    return nums [0];
    }



/* Max Number
create a method that will accept an int array and return the smallest number from the array
     */

    public static int maxNumber (int [] nums){
        int max = nums[0];

        for (int num : nums){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

}

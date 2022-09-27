package my_utilities_libary;

import java.util.Arrays;

public class ArrayUtil {

    // 1
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


    // 6


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




//
 /* Contains
create a method that will accept an int array and an int number. Check and return if the given number is in the array. */

    public static boolean contains(int [] nums, int element) {

        for (int each : nums) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }


    public static int [] addElement (int [] original, int elementToAdd){
        int [] newArray = new int[original.length + 1]; // we make plus more number
        for (int i = 0; i < original.length; i++){
            newArray[i] = original[i];
        }
        // instead of doing a loop ourselves, we could have used Are=rays.copyOf()
        newArray[newArray.length - 1] = elementToAdd; // in the last index put new number
        return newArray;
    }

    public static String [] addElement (String [] original, String element){
        //return null;
        String [] newArr = new String[original.length + 1];
        newArr = Arrays.copyOf(original,newArr.length);
        newArr[newArr.length - 1] = element;
        return newArr;
    }



    public static int [] addElement (int [] original, int [] elementsToAddv){

        int [] newInt = new int[original.length + elementsToAddv.length];
        for (int i = 0, j = 0; i < newInt.length; i++){ // j - different array
            if (i < original.length){
                // added the element from original array in the new array
                newInt[i] = original[i]; // store original to the new position to newInt
            } else {
                // added a new elements to the array
                newInt[i] = elementsToAddv[j++]; //store to the element then incroment, stop when will be end of the array
            }
        }
        return newInt;
    }




































    }

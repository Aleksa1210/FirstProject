package day29_arrays;

public class AverageNumbers {
    public static void main(String[] args) {

        /*
    Average Number from Array
    Given an int array calculate the average number -> Make it flexible so it will work with any array size
    Examples:
    [1,2,3] -> average: 2
    [10, 15, 5, 6] -> average: 9
    [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
         */

        int [] nums = {10, 15, 5, 6};
        int sum = 0;

        // example 1 for general
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        // example 2 for each
        for (int exam2 : nums){
            sum += exam2;
        }
        System.out.println("average " + (sum/nums.length));



















    }
}

package day32_arrays;

import java.util.Arrays;

public class AverageOfEach2 {
    public static void main(String[] args) {

        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

        double total = 0;
        int totalLength = 0;


        for (int i = 0; i < nums.length; i++) {
            double sum = 0;

            for (int j = 0; j < nums[i].length; j++){
                sum += nums[i][j];


            }
            System.out.println(Arrays.toString(nums[i]) + " the averge is: " + (sum/nums[i].length));
            total += sum;
            totalLength += nums[i].length;
        }
        System.out.println("Averge of the whole 2D array " + (total/totalLength)); // count all numbers and / on all


        /*
        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}

        int i = 0
        int j = 0
        nums [i][j]
        nums [0][0] -->3
        int j = 1
        nums [0][1] --> 4
        int j = 2
        nums [0][2] --> 5
        int j = 3
        nums [0][3] --> 6

           i = 1
        int j = 0
        nums [i][j]
        nums [1][0] -->3
        int j = 1
        nums [1][1] --> 4
        int j = 2
        nums [1][2] --> 5
        int j = 3
        nums [1][3] --> 6
           then again 3 times
         */


















    }
}

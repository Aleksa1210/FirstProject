package day32_arrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {



        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
            };

        double total = 0;
        int totalLength = 0;


        for (int [] eachArray : nums) {

           int sum = 0;
        for (int num : eachArray){
                sum += num;


        }
            System.out.println(Arrays.toString(eachArray) + " the averge is: " + (sum/eachArray.length));
        total += sum;
        totalLength += eachArray.length;
        }
        System.out.println("Averge of the whole 2D array " + (total/totalLength)); // count all numbers and / on all









    }
}

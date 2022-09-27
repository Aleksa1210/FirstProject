package day29_arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {


        int [] nums = {30, 12, 159, 12};

        for (int i = 0; i < nums.length; i++){

            System.out.println("Traditional " + nums[i]);
        }
        System.out.println(Arrays.toString(nums));



        System.out.println();


        // example

        for ( int element : nums){
            System.out.println("for each:" + element);
        }


        //String example

        String [] classes = {"java", "soft skills", "selenium", "database"};

        for (int j = 0; j < classes.length; j++){
            System.out.println(classes[j]);
        }

        System.out.println();


        for ( String word : classes){
            System.out.println(word);
        }

        System.out.println();

        // double example


        double [] prices = {10.4, 40.2, 410.2};

        // for each
        for (double each : prices){
            System.out.println("$ " + each);
        }















    }
}

package day28_array;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {



       int[] studentOne  = {3, 6, 10};
        System.out.println("Hardcode sum" + (studentOne[0] + studentOne[1] + studentOne[2]));


       int sum = 0;
        for(int i = 0; i < studentOne.length; i++){
           sum += studentOne[i];

       }
        System.out.println(sum);










    }
}

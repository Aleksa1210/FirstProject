package homework.all;

import java.util.Arrays;

public class hm03_19_1 {
    public static void main(String[] args) {



        int [][] num = {

                {3, 5, 1},
                {1, 6, 10},
                {5, 21, 10}
        };




        for (int i = 0; i < num.length; i++){
            int max;
            System.out.println("new");

            for (int j = 0; j < num.length ; j++){
                System.out.println(Arrays.deepToString(num));
                //max[i] += j;




                    System.out.println();
                }
        }

        System.out.println("First Condition");
        int[][] numbers = {{3, 5, 1},
                {1, 6, 10},
                {5, 21, 10}
        };

        int[] num1 = {numbers[0][0] + numbers[1][1] + numbers[2][2]};
        int[] num2 = {numbers[0][2] + numbers[1][2] + numbers[2][0]};

        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString((num2)));
        System.out.println("Second Condition");
        int biggest = 0;
        for (int [] eachArray : numbers) {
            int arr = 0;
            for(int each : eachArray){
                biggest+=each;
                if (biggest < arr) {
                    biggest = arr;
                }


            }
            System.out.println("Biggest diagonal is: "  + (biggest));
        }
        System.out.println("Diagonal character");


        char letter [][] = new char[3][];

        char [] letterOne = {'a', 'b', 'c'};
        char [] letterTwo= {'d', 'e', 'f'};
        char [] letterThree = {'g', 'h', 'i'};
        System.out.println(""+letterOne[0] + letterTwo[1] + letterThree[2] +" "+ letterOne[2] + letterTwo[1] + letterThree[0] );


















    }
}

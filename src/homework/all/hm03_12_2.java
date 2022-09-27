package homework.all;

import java.util.Arrays;
import java.util.Scanner;

public class hm03_12_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you have");
        int num = input.nextInt();
        int [] number = new int [num];
        int sum = 0;
        int total = 0;



        for(int i = 0; i < number.length; i++){
            System.out.println("Add the number " + (i + 1));
          number[i] = input.nextInt();

          sum = sum + number[i];

          } total = sum/num;

            System.out.println("total = " + total );






















    }
}

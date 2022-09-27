package day23_loops;

import java.util.Scanner;

public class MaskAndMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648; // -2135676689
        int min = 214748364; // 24565786899
        int amount = 0;


        while (amount < 5){  // it will repeat/ask 5 times
            amount++;

            System.out.println("Enter a number");
            int number = input.nextInt();  // number which will write user

            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }


        System.out.println("Max: " + max);
        System.out.println("Min: " + min);



















    }
}

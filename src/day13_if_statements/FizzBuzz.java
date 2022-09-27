package day13_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        //int number1 = 33;


        if (number % 3 == 0) {
            System.out.println("Fizz");
        }
        if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else
            System.out.println(number);

    }
}

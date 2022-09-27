package day09_scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1 ");
        int number1 = input.nextInt();

        System.out.println("Please enter number 2 ");
        int number2 = input.nextInt();
        System.out.println(number1);
        System.out.println(number2);

        System.out.println("The numbers are equal " + (number1 == number2));


    }


}

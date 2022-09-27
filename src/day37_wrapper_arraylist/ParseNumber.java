package day37_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {



        String year = "2022";

        // normal concatenation
        System.out.println("This year " + year);
        System.out.println("Next year will be " + (year + 1));


        int numYear = Integer.parseInt(year);
        System.out.println("Next year will be " + (numYear + 1));


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: I am x years old");
        String str = input.nextLine(); // I am x years old
        // in 5 years you will be &ageIn5Years


        /*
        String [] arr = str.split(" "); // we can make line 32 the way
        String agePart = arr[2];        // we can make line 32 the way
         */

        String agePArt = str.split(" ")[2]; // [2] - position number year, take number part
        int age = Integer.parseInt(agePArt); //[2] it was String, change on the int (number) type
        System.out.println("In 5 years, you will be " + (age + 5));



    /* I am x years old
    I am 10 years old
    str.split(" ") --> { "I", "am", "10", "years", "old"} --> arr[2] --> 10
     */




    }
}

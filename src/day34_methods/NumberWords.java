package day34_methods;

import java.util.Scanner;

public class NumberWords {


    public static String numberAsWord (int num){

        if (num <= 1 || num > 10){
            return num + " is an invalid number";
        }


        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        return words[num - 1]; // -1 will convert the number to an index

        /* why can't I do this
        int num = numberAsWord(input.nextInt());

        the method returng String, so we must store into a String variable
        String num = numberAsWord(input.nextInt());
         */


    }


    public static void main(String[] args) {
        numberAsWord(3);
        System.out.println(numberAsWord(7));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(input.nextInt())); // to write number in the cons
    }











}

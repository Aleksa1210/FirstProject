package day24_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        int spaces = 0;


        for (int i = 0; i < str.length(); i++){

            if (str.charAt(i) == ' '){  // str.substring (i, i + 1).equals (" ")  (substring count with first letter until space)
                spaces++;

            }
        }
        System.out.println("Number of words " + (spaces + 1));















    }
}

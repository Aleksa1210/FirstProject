package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first name");
        String firstname = input.nextLine().toUpperCase();
        System.out.println("Enter your last name");
        String lastName = input.nextLine().toUpperCase();


        System.out.println("" + firstname.charAt(0) + lastName.charAt(0));

        /*
        1)
        firstName = firstName.toUpperCase();
        char firstLetter = firstname.charAt(0);

        2)
        char firstLetter = firstname.toUpperCase().charAt(0);
         */















    }
}

package day14_if_stetements;

import java.util.Scanner;

public class JiginApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pincode: ");
        int actualPin = input.nextInt();
        System.out.println("Please enter thee last 4 digits of your SSN: ");
        int actualSSN = input.nextInt();


        int expectedPin = 1552;
        int expectedSSN = 1234;

        if (actualPin == expectedPin && actualSSN == actualSSN){
            System.out.println("Authentication successful");


        } else {
            System.out.println("Authentication failed");
            if (actualPin != expectedPin){
                System.out.println("incorrect pin code");
            }
            if (actualSSN != expectedSSN){
                System.out.println("invalid ssn ");
            }
        }






    }
}


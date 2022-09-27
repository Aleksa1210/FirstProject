package day14_if_stetements;

import java.util.Scanner;

public class JiginApp2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pincode: ");
        int actualPin = input.nextInt();
        System.out.println("Please enter thee last 4 digits of your SSN: ");
        int actualSSN = input.nextInt();


        int expectedPin = 1552;
        int expectedSSN = 1234;
        boolean validPin = actualPin == expectedPin;
        boolean validSSn = actualSSN == expectedSSN;

        if (validPin && validSSn) {
            System.out.println("Authentication successful");


        } else {
            System.out.println("Authentication failed");
            if (!validPin) {
                System.out.println("incorrect pin code");
            }
            if (!validSSn) {
                System.out.println("invalid ssn ");
            }
        }
    }
}

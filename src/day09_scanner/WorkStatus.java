package day09_scanner;

import java.util.Scanner;


public class WorkStatus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String firstName = input.next();
        System.out.println("What is your last name");
        String lastName = input.next();
        System.out.println("Are you employed?");
        boolean employed = input.nextBoolean();
        System.out.println("Are you student?");
        boolean student = input.nextBoolean();

        String detalis = firstName + " " + lastName + " is employed " + employed + " are you student " + student;
        System.out.println(detalis);





    }
}

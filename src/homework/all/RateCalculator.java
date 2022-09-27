package homework.all;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your salary? ");
        double salary = input.nextDouble();

        System.out.println("How many hours are you working in a week? ");
        int howManyHours = input.nextInt();

        double rate = salary / (howManyHours * 52);
        System.out.println("With the salary of " + salary + " and working for " + howManyHours + " hours, yor hourly rate is: " + rate);


    }
}

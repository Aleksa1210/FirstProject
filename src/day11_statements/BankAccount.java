package day11_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Write your balance? ");
        double accountBalance = input.nextDouble();

        System.out.println("How much are withdraw");
        double withdraw = input.nextDouble();

     //   double accountBalance = 40;
     //   double withdraw = 100;
     accountBalance -= withdraw;

        if (accountBalance < 0) {
            System.out.println("Took out too much money ");
            System.out.println("Balance before fee: " + accountBalance);
            accountBalance -= 100;
        }
        System.out.println("Balance " + accountBalance);




    }
}

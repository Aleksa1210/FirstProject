package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {




        String [] bankAccount1  = {"Brad Smith", "Checking" , "100505050", "100,000,000"};
        System.out.println(bankAccount1.length);
        System.out.println("Whole Array " + Arrays.toString(bankAccount1));
        System.out.println("Name: " + bankAccount1[0]);
        System.out.println("Account type: " + bankAccount1[1]);
        System.out.println("Account number: " + bankAccount1[2]);
        System.out.println("You balance: " + bankAccount1[3]);

        System.out.println("__________________________________");


        String [] bankAccount2 = new String[4];
        System.out.println(Arrays.toString(bankAccount2));

        bankAccount2[0] = "Jamie Fox";
        bankAccount2[1] = "Saving";
        bankAccount2[2] = "100505252";
        bankAccount2[3] = "50,000,000";

        System.out.println(Arrays.toString(bankAccount2));

        System.out.println("________________________________");


        String [] bankAccount3 = new String[4];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String fullName = input.nextLine();
        bankAccount3 [0] = fullName;

        System.out.println("Enter your account type");
        bankAccount3 [1] = input.nextLine();

        System.out.println("Enter your account number");
        bankAccount3[2] = input.nextLine();

        System.out.println("Enter your balance");
        bankAccount3[3] = input.nextLine();

        System.out.println(Arrays.toString(bankAccount3));



        System.out.println("__________________________________");


        String [] bankAccount4 = new String[4];
        String [] questions = {"full name", "account type", "account number", "balance"};

        for (int i = 0; i < bankAccount4.length; i++){
            System.out.println("Enter your " + questions[i]);
          bankAccount4[i] = input.nextLine();

        }
        System.out.println(Arrays.toString(bankAccount4));










    }
}

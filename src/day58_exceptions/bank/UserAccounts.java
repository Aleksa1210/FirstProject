package day58_exceptions.bank;

import day52_inheritance.hidding.B;

public class UserAccounts {
    public static void main(String[] args) {

        Bank account1 = new Bank();
        account1.balance = 1000; //balance
        account1.withdraw(500); // take off money
        System.out.println(account1.balance);

    //    account1.withdraw(2000); // take off money second time // uncomment to see the exception

        try {
            account1.login("jame", "007");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }


        // invalid usernam

        try {
            account1.login("jamesss", "007");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }

        // invalid password

        try {
            account1.login("jame", "something");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }





    }
}

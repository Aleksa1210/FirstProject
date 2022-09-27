package homework.all;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a username");
        String userName = input.nextLine();

        System.out.println("Please enter a password");
        String password = input.nextLine();

        if (password.length() < 5) {
            System.out.println("Password cannot be less than 5 characters");
        } else {
            if (password.length() >= 5 && userName.equals(password)) {
                System.out.println("Invalid password, username should not be in it");
            }else {
                    System.out.println("Valid password");
                }




        }















    }
}

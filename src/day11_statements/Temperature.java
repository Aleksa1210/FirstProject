package day11_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature ");
        int temperature = input.nextInt(); // Scanner version

      // int weather = 90; if (weather >= 70) {  - hard code version
        if (temperature >= 70) {
            System.out.println("Its nice day. Go outside, but with laptop to code java");
        } else {
            System.out.println("Its so cold. Code more java");
        }

    }
}

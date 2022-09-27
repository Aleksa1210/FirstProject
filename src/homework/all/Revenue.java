package homework.all;

import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // make a Scanner variable
        System.out.println("Hello, enter the price of the item ");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        double revenue = price * quantity;
        System.out.println("The revenue is: $ " + revenue );
        //System.out.println("The revenue is: $ " + (price * quantity));
       // System.out.println("The revenue is: $ " + (input.nextDouble() * input.nextInt()));




        // popular name  for Scanner: scan, input, scanner, keyboard
    }
}

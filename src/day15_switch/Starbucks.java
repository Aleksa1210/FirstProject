package day15_switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Starbuks. Which size drink do you want?");
        String size = input.nextLine();
        int cal = 0;
        double price = 0;
        boolean validOrder = true;


        switch (size){
            case "Tall":
                price = 2.50;
                cal = 100;
            break;
            case "Grande":
                price = 4.00;
                cal = 150;
                break;
            case "Venti":
                price = 4.50;
                cal = 200;
                break;
            default:
                System.out.println("We don't have the size");
                validOrder = false;

        }
        if (validOrder) {
            System.out.println("Your order for a " + size + "coffee is $ " + price + " and has " + cal + "calories");
        }






    }
}

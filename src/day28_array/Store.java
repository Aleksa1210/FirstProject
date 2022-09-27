package day28_array;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {




        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad"};

        boolean hasJacket = false;


        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("jacket")) {
                hasJacket = true;
                break;
            }


        }
        System.out.println(hasJacket ? "Jacket in the stock" : "Jackets out of stock"); // jacket in the stock

        System.out.println(Arrays.toString(items).toLowerCase(Locale.ROOT).contains("jacket")); // true

        /* if you don't want use ternary
        if(hasJacket ){
        System.out.println("Jacket in the stock");
        } else {
        System.out.println("Jackets out of stock");
        }
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Which item are you looking ");
        String lookingFor = input.nextLine();
        boolean inStock = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase(lookingFor)){
                inStock = true;
                break;
            }

        }
        System.out.println(lookingFor + (inStock ? " in stock" : " out stock "));












    }
}

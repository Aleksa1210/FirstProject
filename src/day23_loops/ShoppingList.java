package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String list = "day40_arraylist.Shopping List:";
        String addMore;


        do {
            System.out.println("Enter the name of the item");
            list += "\n* " + input.nextLine(); // You can assign to a String variable first then concatenate to list
            // String item = input.nextLine(); last += item;

            System.out.println("Do you want to add more to your shopping list? ");
            addMore = input.nextLine();

        }while (addMore.equalsIgnoreCase("yes") || addMore.equalsIgnoreCase("y")); // if user types 'yes' in the console about wanting to add more items, then the loop will iterate again

        // if the user types anything besides 'yes' the equals method will give false and the loop will stop

        System.out.println(list);












    }
}

package homework.all;

 import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String productName = input.nextLine();

        System.out.println("Enter the price" + productName);
        double price = input.nextDouble();

        System.out.println("How many" + productName + "do you want to buy ");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("What is your full name for the order ");
        String fullName = input.nextLine();


        double totalCost = price * quantity;
        String order = fullName+ " your order is " +  quantity + " " + productName + " has been placed. " + " Your total is " + totalCost;

        System.out.println(order);



    }
}

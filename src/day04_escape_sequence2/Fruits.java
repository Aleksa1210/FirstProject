package day04_escape_sequence2;

public class Fruits {


    public static void main(String[] args) {

        int apples = 50; // declaring
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how many apples we have: " + apples);
        System.out.println("How much grapes do you have? "+ grapes);
        System.out.println("Bananas: " + bananas);

        System.out.println("Sold some apples");
        apples = 30; //reassigning apples to have value of 25
        System.out.println("Apples after selling: " + apples);

        int price = 20;

        System.out.println("The price of my " + apples + " apples is $" + price);





    }
}

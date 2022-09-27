package day07_unary_operators;

public class Shopping {
    public static void main(String[] args) {

        int numberPfItems = 0;
        double price = 0.0;

        System.out.println(" We pick up 1 water ");
        System.out.println(" How many items in the cart " + ++numberPfItems); //preincrement, so the number of items increases righw away, then it is printed
        price = price + 2.5; // take price value which 0, and add 2.5,and they reassign to the price variable

        System.out.println("we pick up 2 eggs");
        System.out.println("How many items in the cart " + ++numberPfItems);
        System.out.println("How many items in the cart " + ++numberPfItems);


        System.out.println(numberPfItems++);
        System.out.println(numberPfItems);


    }
}

package day08_relational_operators;

public class GiftCard {
    public static void main(String[] args) {


        String name = "Gift card";
        double balance = 200;
        System.out.println("Buy item 1 for 10$ ");
        balance -= 10.80 ; // gifCard = giftCard - 10.80;
        System.out.println("Buy item 2 for 45$ ");
        balance -= 45; // gifCard = giftCard - 45;
        System.out.println("Your gift card balance is now: " + balance);




    }
}

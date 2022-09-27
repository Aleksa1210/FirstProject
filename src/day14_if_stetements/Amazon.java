package day14_if_stetements;

public class Amazon {
    public static void main(String[] args) {

        double price = 25.99;
        boolean hasPrime = false;


        if (hasPrime){
            System.out.println("Eligible for 2 day shipping");
        } else {
            // here when hasPrime is false
            if (price >= 25){
                System.out.println("Eligible for regular free shipping");
            } else{
                System.out.println ("No eligible for free shipping fee: 3.99");
                price += 3.99; // price = price + 3.99;
            }



        }






    }
}

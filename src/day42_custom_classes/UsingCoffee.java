package day42_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {


        Coffee information = new Coffee();

        information.brand = "Starbucks";
        information.type = "Latte";
        information.size = 500;
        information.price = 20.30;

        System.out.println(information);
        information.drink(); // every time when drink it getting few
        information.drink();
        information.drink();
        information.refill(8);

        System.out.println(information);






    }
}

package day44_custom_classes;

public class UsingOffer {
    public static void main(String[] args) {


        Offer com = new Offer("NYC", "Apple");
        System.out.println(com);



        Offer com2 = new Offer("NYC", "Apple", 150_000);
        System.out.println(com2);

        Offer com3 = new Offer("NYC", "Apple", 150_000, true, 12);
        System.out.println(com3);




    }
}

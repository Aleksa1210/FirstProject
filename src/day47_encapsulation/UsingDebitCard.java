package day47_encapsulation;

public class UsingDebitCard {
    public static void main(String[] args) {


        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1234567890123456L, "James", 10000000);
        System.out.print(obj1);

        System.out.println();


        DebitCard obj2 = new DebitCard(123456, "Ben", 10000000);
        System.out.println(obj2);
        System.out.print(obj2.accountType);

        System.out.println();


        DebitCard obj3 = new DebitCard(1234567890123456L, "James", "Visa" ,  7000, 10000000);
        System.out.print(obj3);

        System.out.println();

        DebitCard obj4 = new DebitCard(1234567891L, "James", "Mir" ,  7, 10000000);
        System.out.print(obj4);


    }
}

package day48_encapsulation;

public class UsePizza {
    public static void main(String[] args) {



        Pizza first = new Pizza("small", 3);
        System.out.println(first);

        first.setNumberOfTopping(2);
        System.out.println(first);


        Pizza second = new Pizza("", -2); // because we put rulse and we cannot use
        System.out.println(second);

        second.setSize("large");
        second.setNumberOfTopping(10);
        System.out.println(second);





    }
}

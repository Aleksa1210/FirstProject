package day36_methods;

public class TypePromotion {

    public static void use (float f){
        System.out.println("calling float method");
    }

    public static void use (double d){
        System.out.println("calling double method");
    }

    public static void use (long l){
        System.out.println("calling long method");
    }


    public static void main(String[] args) {
        use(3);
        use(3.5);
        use(1.2f);
        use(3L);
    }







}

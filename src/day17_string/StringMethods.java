package day17_string;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";
        //how to compare String values  ---> use .equals()
        System.out.println(name.equals("james"));
        System.out.println(name.equals("James"));
        System.out.println(name.equalsIgnoreCase ("James")); // equalsIgnoreCase ignoring case sensitivity


        System.out.println("cat".equals("dog"));



        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b));        // compare a object with b object;
        System.out.println(a.equals("hello")); // compare a object with literal "hello" object

        System.out.println(a == b); // = do not use ==

        System.out.println(name.length());

        String last = "today was fun";
        System.out.println(last.length());

        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));








    }
}

package homework.all;

public class RelativeChecker {
    public static void main(String[] args) {



        String name = "James Bond";
        String name2 = "Jamie Bond";
        String name3 = "Alex Benji";

        if (name.contains("Bond") && name3.contains("Benji")) {
            System.out.println("Not Related ");
        }
            if (name.contains("Bond") && name2.contains("Bond")) {
         System.out.println("Related");
       }









    }
}

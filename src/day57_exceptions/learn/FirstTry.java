package day57_exceptions.learn;

public class FirstTry {
    public static void main(String[] args) {

        System.out.println("First name");




        try {
            String word = "java";
            System.out.println(word.charAt(100)); // if give exception/error
        }catch (Exception e){ // Exception like parameters/name  ab=nd e -name
            System.out.println("Exception happened");
        }




        System.out.println("Last Line");



    }

}

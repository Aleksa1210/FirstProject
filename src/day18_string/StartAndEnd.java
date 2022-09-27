package day18_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        System.out.println(str.startsWith("Apples"));


        String y ="App";
        System.out.println(str.startsWith(y)); //does the String str start with the String s

        System.out.println(str.startsWith("  App"));
        System.out.println(str.startsWith("Aoo"));


        String sentence = "today was a good day";
        System.out.println(sentence.startsWith("today was a"));

        System.out.println(sentence.endsWith("day41_arraylist"));  //true
        System.out.println(sentence.endsWith(" day41_arraylist")); // true
        System.out.println(sentence.endsWith("good")); //false
        System.out.println(sentence.endsWith("today was a good day")); //true






    }
}

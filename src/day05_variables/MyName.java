package day05_variables;

public class MyName {
    public static void main(String[] args) {

        char letter1 = 'a';
        char letter2 = 'l';
        char letter3 = 'e';
        char letter4 = 'k';
        char letter5 = 's';


        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);

        System.out.println();


        System.out.println(letter1 + " " + letter2 + " " + letter3 + " " + letter4 + " " + letter5);
        System.out.println("chars " + letter1 + letter2 + letter3 + letter4 + letter5);
        System.out.println("My name is " + letter1 + letter2 + letter3 + letter4 + letter5);

        // or you can make a veriable of the name

        System.out.println();

        String name = "" + letter1 + letter2 + letter3 + letter4 + letter5; // String name = aleks
        System.out.println(name);
        System.out.println("My name " + name);






    }


}

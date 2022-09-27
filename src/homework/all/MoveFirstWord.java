package homework.all;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine().trim();

        int example = sentence.indexOf(' '); // (" ")

        String firstWord = sentence.substring(0, example);

        String result  = sentence.substring(example + 1) + " " + firstWord;

        // String result  = sentence.substring(spaceIndex).trim + " " + firstWord;


        //String sen = "java is a fun language";
       // System.out.println(sen.substring(5) + " " + sen.substring( 0,5));
        System.out.println(result);











    }
}

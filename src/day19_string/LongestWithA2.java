package day19_string;

import java.util.Scanner;

public class LongestWithA2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words");
        String word1 = input.nextLine().toLowerCase();
        String word2 = input.nextLine().toLowerCase();
        String word3 = input.nextLine().toLowerCase();

        String longestWord = "";

        if (word1.contains("a") && word1.length() > longestWord.length()){
            longestWord = word1;
        }
        if (word2.contains("a") && word2.length() > longestWord.length()){
            longestWord = word2;
        }
        if (word3.contains("a") && word3.length() > longestWord.length()){
            longestWord = word3;
        }
        System.out.println(longestWord.isEmpty()? "No single largest word with a " : longestWord + "is the longest word with a " );


        /* longestWord.isEmpty()?
        print: "No single largest word with a "
        else
        print: longestWord + "is the longest word with a "
         */

















    }
}

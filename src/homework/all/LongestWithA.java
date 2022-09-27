package homework.all;

import java.util.Locale;
import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words");
        String word1 = input.nextLine().toLowerCase();
        String word2 = input.nextLine().toLowerCase();
        String word3 = input.nextLine().toLowerCase();

        int oneLen = word1.length();
        int twoLen = word2.length();
        int threeLen = word3.length();

        if (word1.contains("a") && oneLen > twoLen && oneLen > threeLen){
            System.out.println(word1 + " is the biggest with a ");
        } else if (word2.contains("a") && word2.length() > oneLen && twoLen > threeLen){
            System.out.println(word2 + " is the biggest with a ");
            } else if (word3.contains("a") && threeLen > oneLen && threeLen > twoLen) {
            System.out.println(word3 + "is the biggest with a ");
        } else {
            System.out.println("No single largest word with a");
        }

































    }
}

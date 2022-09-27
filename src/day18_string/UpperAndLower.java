package day18_string;

import java.util.Locale;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "sNOw";
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str);

        String word = "HELLO";
        word = word.toLowerCase(Locale.ROOT);
        System.out.println(word);

        int a = 4;
        a++;
        a += 5;
        System.out.println(a);

        String word2 = word + " WORLD";
        System.out.println(word2);
        System.out.println(word);
        word += " next text"; // word= word + "next text";
        System.out.println(word);


        String old = "mark";
        String newValue = old.toUpperCase(Locale.ROOT);
        System.out.println(old);
        System.out.println(newValue);











    }
}

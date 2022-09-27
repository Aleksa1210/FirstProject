package day31_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        /* given two String
        find if they are anagram or not

        the characters are the same in both Strings, but the order is different
         */


        String str = "listen";
        String str2 = "silent";

        char [] one = str.toCharArray(); // translate to Char  l/i/s/t/e/n
        char [] two = str2.toCharArray(); // translate to Char  s/i/l/e/n/t

        Arrays.sort(one); // max them for alphabet [e, i, l, n, s, t]
        Arrays.sort(two); // max them for alphabet [e, i, l, n, s, t]
        System.out.println(Arrays.toString(one)); // just look
        System.out.println(Arrays.toString(two)); // just look

        if (Arrays.equals(one, two)){  // if tsr = str2
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }


        System.out.println(Arrays.equals(one, two) ? "Anagram" : "not anagram"); //















    }
}

package day27_loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        /* Unique characters
    Given a String, find and print the unique characters. A character is
    unique if it only appears once in the String.
    Ex:
    Input: AAABCCDEEF
    Output: BDF
    -> the characters B D and F are only found in the String once so they are unique */

        String str = "AAABCCDEEFQs";

        for (int i = 0; i < str.length(); i++) {


            char letter = str.charAt(i);
            int count = 0;


            for (int j = 0; j < str.length(); j++) {
                char inner = str.charAt(j);
                if (letter == inner) {
                    count++; // if == then count
                }

            }
            if (count == 1){  // the counter be one when the character was unique. The character will always match with itself one time, so it will never o, but if the counter value i more than 1 then that character matched with mulipl other character , which means if is not unique
                System.out.println(letter);
            }

        }

















    }
}

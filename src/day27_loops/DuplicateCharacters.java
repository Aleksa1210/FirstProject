package day27_loops;

public class DuplicateCharacters {
    public static void main(String[] args) {



        /* Duplicate characters
        Given a String, find and print the duplicate characters. A character is
        duplicate if it appears more than once in the String.
        Ex:
        Input: AAABCCDEEF
        Output: ACE
        -> the characters A C and E are found in the String multiple times, so they are duplicates */

        String str ="AAABCCDEEF";
        String checked = "";

        for (int i = 0; i < str.length(); i++){

            if (checked.contains("" + str.charAt(i))){ //if you have A, then will escape another A, because we have already
                continue;
            }
            int count = 0;


            for (int j = 0; j < str.length(); j++){

                if (str.charAt(i) == str.charAt(j)){
                    count++; //if quel == then it will make +
                }

            }
            if (count > 1){ // count >= 2; count != 1;
                System.out.print(str.charAt(i));
            }
            checked += str.charAt(i);
        }








    }
}

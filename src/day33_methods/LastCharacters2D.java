package day33_methods;

public class LastCharacters2D {
    public static void main(String[] args) {


         /*
        Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

        Ex:

            {"James", "is", "back"}
            {"he", "was", "never", "gone"}
            {"methods", "tomorrow"}

        Output:
            ssk
            esre
            sw

         */


        String [][] word= {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };

        for (String [] eachArray : word){ // String Array

            for (String eachWord : eachArray ){
                System.out.print(eachWord.charAt(eachWord.length() - 1)); // it is String // words[i][j].charAt(words[i][j].lenght - 1));

            }
            System.out.println(); // if we will not put all char will together
        }














    }
}

package day26_loops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String word = " appleeee";
        String checked = ""; //appleeee / aple
                            //12214444 / 1214




        for (int i = 0; i < word.length(); i++) {
            int count = 0; // everytime the outer loop iterates, the counter is set back to 0. It is reset between every character
            char letter = word.charAt(i); // male variable
            if (checked.contains("" + letter)){  // (1)if we will not put, then will count all pp, eeee
                // one more way if (!checked.contains("" + letter)){
                continue;
            }

            for (int j = 0; j < word.length(); j++) {
                char eachLetter = word.charAt(j);

                if (letter == eachLetter){   // word.charAt(i) == word.charAt(j);
                    count++;
                }



            } // end of the inner loop
            System.out.println(letter + " - " + count);
            checked += letter; // (2)if we will not put, then will count all pp, eeee
        }









    }
}

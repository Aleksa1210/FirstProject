package homework.all;

import java.util.ArrayList;
import java.util.Arrays;

public class c3 {
    public static void main(String[] args) {

        String hiddenWord ="";
        ArrayList <String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        for (int i = 0; i < passwords.size(); i++){
            String s1 = passwords.get(i);
            for (int j = 0; j< s1.length() ; j++){
                hiddenWord+="*";

            }// i have the word converted to hidden stars

            passwords.set(i,hiddenWord); // replace the word with its hidden word
            hiddenWord=""; // to be ready for the next element
        }
        System.out.println(passwords);
    }
}


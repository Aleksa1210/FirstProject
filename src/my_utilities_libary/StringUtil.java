package my_utilities_libary;

import java.util.Arrays;
import java.util.Locale;

public class StringUtil {



// 1
    public static String reverse (String str){
        String reversed = "";

        for (int i = str.length() -1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        return reversed;
    }

    // public static void main(String[] args) {  // don't use main method
    //    System.out.println(reverse("java"));
    // }





    // 2
       /* create a method will accept a String and return a String in proper format. Proper format is:
        First character starting as uppercase and the rest as lowercase
        Ex: Input: jamES
        Output: James */


    public static String fix (String str){
        str = str.trim(); // not nessesary
        return str.substring(0,1).toUpperCase(Locale.ROOT) + str.substring(1).toLowerCase();

    }




    //3
    /*  Frequency of Character
    create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word
    Ex: Input: apple, p
    Output: 2
    Ex: Input: apple, z
    Output: 0
    Ex: Input: aabbaacca, a
    Output: 5 */

    public static int frequencyOfCharacter (String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }



    //4

    /* Unique Characters
create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once. Hint: use your frequency method to do some of the work
Ex: Input: aaaaabcccdeeff
	Output: bd */

    public static String unique (String str) {
        String uniq = "";
        String checked = "";

        for (char i = 0; i < str.length(); i++) {
            if (checked.contains("" + str.charAt(i))){ // escape the same letters
                continue;
            }
            int count = StringUtil.frequencyOfCharacter(str, str.charAt(str.charAt(i)));
            checked += str.charAt(i);

            if (count == 1) {
                uniq += str.charAt(i);
            }
        }

        return uniq;
    }
    //________________________________________________________

    public static String uniqueCharacters(String str){

        String unique = "";
        String checked = "";

        for(int i = 0; i < str.length(); i++){

            if(!checked.contains("" + str.charAt(i))){
                int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                checked += str.charAt(i);

                if(count == 1){
                    unique += str.charAt(i);
                }
            }
        }

        return unique;
    }

    // aaaaabcccdeeff
    // int count = StringUtil.frequencyOfCharacter(str, str.charAt(str.charAt(i)));
    // int = 0
    // int count = StringUtil.frequencyOfCharacter(str, str.charAt(str.charAt(0)));
    // int count = StringUtil.frequencyOfCharacter(aaaaabcccdeeff, a);
    // ----> 5
    // i = 5
    // int count = StringUtil.frequencyOfCharacter(str, str.charAt(str.charAt(5)
    // int count = StringUtil.frequencyOfCharacter(aaaaabcccdeeff, b);
    // ----> 1
    // i = 5

//________________________________________________________

    /* HTML Generator
Given a String in the following format take the number part of the generator the html tags.
Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^
        Ex: Input: div^2
        Output: <div></div> <div></div>
        Ex: Input: li^3
        Output: <li></li><li></li><li></li> */
    public static String htmlGenerate (String str){
        String html = "";
        String [] parts = str.split("\\^"); // str.replace ("^", " ").split(" ");
        int repeat = Integer.parseInt(parts [1]);

        for (int i = 0; i < repeat; i++){
            html += "<" + parts[0] + "></" + parts[0] + "> ";
        }
        return html;
    }


    //________________________________________________________































}

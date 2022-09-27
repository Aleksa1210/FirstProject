package day35_methods;

import java.util.Locale;

public class FixFormat {
    /* Utility Classes
Create the following in the StringUtil class:
____________________________________________________________

Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James */


    public static String fix (String str){
        str = str.trim(); // not nessesary
        return str.substring(0,1).toUpperCase(Locale.ROOT) + str.substring(1).toLowerCase();

    }

    public static void main(String[] args) {
        System.out.println(fix("jamES"));
    }







}

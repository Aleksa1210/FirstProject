package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = input.nextLine(); // jaMES
        System.out.println("Enter last name");
        String lastName = input.nextLine();


       firstName = firstName.trim().toLowerCase(); // james
        lastName = lastName.trim().toLowerCase();

        String fixedFirstName = firstName.substring(0,1).toUpperCase(); //J
        fixedFirstName += firstName.substring(1); //James

        String fixedLastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        System.out.println(fixedFirstName + " " + fixedLastName);




        //( "" + firstName.CharAt(0).method --> this will also give you the first character, but as a char type





















    }
}

package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the url");
        String website = input.nextLine();
        website = website.toLowerCase();

        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") ||website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");


        if (validStart && validEnd){
            System.out.println(website + " it is a valid website");
        } else {
          if (!validStart){
              System.out.println("url needs to start with www.");
          }
        }

        if (!validEnd){
            System.out.println(" url need to end with .com or .edu or .gov or .net");
        }















    }
}

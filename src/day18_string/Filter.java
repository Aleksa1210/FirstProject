package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a message");
        String massage = input.nextLine(); // input.nextLine().toLowerCase().trim();
        massage = massage.toLowerCase();
        massage = massage.trim();


        if (massage.contains("java is bad") || massage.contains("quit") || massage.contains("have fun") || massage.contains("crying")) {
            System.out.println("Message failed to send");
        } else {
            System.out.println("\"" + massage + "\"" + " was sent");
        }














    }
}

package day19_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a url ");
        String url = input.nextLine(); // www.google.com
                                       //0123456789 10 11 12 13

        String website = url.substring(4, url.length() - 4);
        System.out.println(website);



















    }
}

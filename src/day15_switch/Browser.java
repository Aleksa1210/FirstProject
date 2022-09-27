package day15_switch;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser ");
        String browser = input.nextLine();
        System.out.println("Enter your url ");
        String url = input.nextLine();

        //String browser = "Chrome";
       // String url = "www.google.com ";

        switch (browser){
            case "chrome":
            case "Chrome":
                System.out.println("Opening " + url + " in the Chrome browser");
                System.out.println("Loading.....");
                break;
            case "Safari":
                System.out.println("Opening" + url + " in the Safari browser");
                System.out.println("Loading.....");
                break;
            case "FireFox":
                System.out.println("Opening" + url + " in the FireFox browser");
                System.out.println("Loading.....");
                break;



        }



    }
}

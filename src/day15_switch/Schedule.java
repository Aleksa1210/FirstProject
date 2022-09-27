package day15_switch;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What day do you want about? ");
        String day = input.nextLine();
      //  String information = "";

        switch (day){
            case "monday":
            case "Monday":
                System.out.println("We have Java with Saim at 7 pm EST"); // information = "We have Java with Saim at 7 pm EST";
                break;
            case "Tuesday":
            case "Wednesday":
                System.out.println("We have Java with Saim at 7 pm EST!");
                break;
            case "Thursday":
                System.out.println("We have soft skills with Nadir at 7 pm EST");
                break;
            case "Friday":
                System.out.println("Day Off");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("We have full day Java with Saim from 10 am to 5 pm EST");
                break;
            default:
                System.out.println("Not a valid day");





        }






    }
}

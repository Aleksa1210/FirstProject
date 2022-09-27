package day15_switch;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number: 1- 7");
        int num = input.nextInt();

        //String day = "";
        //int num1 = 8;

        switch (num){    // switch (num1){
            case 1:
                System.out.println("Monday"); // day = "Monday";
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a vakid day");
                break;
        }



    }
}

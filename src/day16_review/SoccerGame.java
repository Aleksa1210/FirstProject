package day16_review;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many minute are left in the game?");
        int minutes = input.nextInt();

        if (minutes >= 0 && minutes <= 90){
            if (minutes > 75){
                System.out.println("Game just getting started");

            } else if (minutes >= 60){
                System.out.println("Players are doing their best");

            }else if (minutes >= 30){
                System.out.println("Middle of the game is going great");
            }else if (minutes >= 0){
                System.out.println("The end of the same is approaching");
            }

        } else {
            if (minutes < 0){
                System.out.println("minutes cannot be a negative number");
            } else {
                System.out.println("games cannot be longer than 90 minutes");
            }



        }



    }
}

package day16_review;

public class SoccerGame2 {
    public static void main(String[] args) {

        /* declare and assign a minutes variable
        use the minutes value to determine how much time is left in the soccer
        game
        use these ranges to determine the outputs:
        - any number less than 0 and more than 90 are not valid:
        when the minutes is less than 0:
        print: minutes cannot be a negative number
        when the minutes is more than 90:
        print: games cannot be longer than 90 minutes
                - when the minutes are between 90 - 75
        print: just getting started
                - when the minutes are between 74 - 60
        print: players are doing their best
                - when the minutes are between 59 - 30
        print: middle of the game is going great
                - when the minutes are between 29 - 0
        print: the end of the same is approaching */

        int time = 65;

        if (time < 0){
            System.out.println("minutes cannot be a negative number");
        } else if (time > 90){
            System.out.println("games cannot be longer than 90 minutes");
        }



        if (time <= 90 && time >= 75){
            System.out.println("Not valid");
        }else if (time <= 74 && time >= 60){
            System.out.println("players are doing their best");
        }else if (time <= 59 && time >= 30){
            System.out.println("middle of the game is going great");
        }else if (time <= 29 && time >= 0){
            System.out.println("the end of the same is approaching");
        }















    }
}

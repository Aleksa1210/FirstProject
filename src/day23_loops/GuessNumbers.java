package day23_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int secretNum = 80; // in future will learn hot to make random numbers
        int guess;

        do {
            System.out.println("Guess a number from 1 - 100");
            guess = input.nextInt();

            if (guess > secretNum && guess < 100){
                System.out.println(guess + " is too high ");
            } else if (guess < secretNum && guess > 0){
                System.out.println(guess + " is too low");
            }

        } while (guess != secretNum); // the loop will continue if you guess wrong, because the guess is not equal to the secret number

        System.out.println("You guessed correct");


















    }
}

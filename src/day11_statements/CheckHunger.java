package day11_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Are you hungry? true or false");
        boolean IsHungry = input.nextBoolean();

        if (IsHungry) {
            System.out.println("You are hungry so I will get some food for you");

        } else {

            System.out.println("Great, than practice java");
        }



    }
}

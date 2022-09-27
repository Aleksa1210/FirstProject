package homework.all;


import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        boolean division2 = num % 2 == 0;
        boolean division3 = num % 3 == 0;
        boolean division5 = num % 5 == 0;


        System.out.println(num + " is divisible by 2 " + division2);
        System.out.println(num + " is divisible by 3 " + division3);
        System.out.println(num + " is divisible by 5 " + division5);




















    }
}

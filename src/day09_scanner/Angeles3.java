package day09_scanner;

import java.util.Scanner;


public class Angeles3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("You need enter their age");
        byte age = input.nextByte();
        System.out.println("Enter your favorite number ");
        long favoriteNumber = input.nextLong();
        System.out.println("Enter your a favorite book");
        String favoriteBook = input.next();
        System.out.println("I am " + age + " years old " + " My favorite number is " + favoriteNumber + " My favorite book is " + favoriteBook);






    }


}

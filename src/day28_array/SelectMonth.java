package day28_array;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Print the month name");
        int mon = input.nextInt();

       String [] month1 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(month1[mon - 1]);


















    }
}

package homework.all;

import java.util.Arrays;
import java.util.Scanner;

public class Hm03_15_URLParts {
    public static void main(String[] args) {
        String url = "https://learn.cydeo.com/courses/130";
        String [] split = url.split("/");
        System.out.println(Arrays.toString(split));


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first name");
        String name = input.nextLine();

        char [] letter = name.toCharArray();
        System.out.println(Arrays.toString(letter).charAt(1) );





















    }
}

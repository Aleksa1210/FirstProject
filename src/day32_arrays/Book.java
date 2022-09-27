package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters is there");
        String [][] book = new String[input.nextInt()][];
        System.out.println(Arrays.deepToString(book));
        input.nextLine();

        for (int i = 0; i < book.length; i++){
            System.out.println("Enter chapter " + (i + 1));
            String chapter = input.nextLine(); // make line for write
            String [] sentences = chapter.split("\\."); // breaking up by the dot (.)
            book[i] = sentences; // make all store inside the book
        }
        System.out.println(Arrays.deepToString(book));



















    }
}

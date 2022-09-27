package day13_if_statements;

import java.util.Scanner;

public class ChooseLanguege {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose language \n1 - English\n2 - Spanish\n3 - Turkish\n4 - Russian\n5 - French");
        int option = input.nextInt();


        if (option == 1) {
            System.out.println("hello, thank for your call");
        } else if (option == 2) {
            System.out.println("hola, gracias para llamar");
        } else if (option == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (option == 4) {
            System.out.println("privet, spasibo za vash zvonok");
        } else if (option == 5){
            System.out.println("Merci ,pour votre appel");
        }




    }
}

package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String uniqueColors = "";


        int colorPicked = 0;
        while (colorPicked<3){
            System.out.println("Pick a color");
            String color = input.nextLine();

            if (uniqueColors.contains(color)) {
                System.out.println("you already have that color");
            } else {
                // if we are here, it means the color is unique

            uniqueColors += color + " ";  // make all together red + blue + red
            colorPicked++;

        }
        }

        System.out.println(uniqueColors);









    }
}

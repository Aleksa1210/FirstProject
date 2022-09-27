package homework.all;

import java.util.Scanner;

public class Angless {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 3 angle numbers");
        double angle1 = keyboard.nextDouble();
        double angl2 = keyboard.nextDouble();
        double angl3 = keyboard.nextDouble();

        boolean isTriangle = angle1 + angl2 + angl3 == 180;
        boolean isCicrle = angle1 + angl2 + angl3 == 360;

        System.out.println("is a triangle " + isTriangle);
        System.out.println("is a circle " + isCicrle);


        //double sum = angle1 + angl2 + angl3;
        //boolean isTriangle = sum == 180;
        // boolean isCircle = sum == 360;



    }
}

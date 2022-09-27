package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {


        String [] studentOne  = {"007", "James", "Bond", "7"}; // you know value
        System.out.println(Arrays.toString(studentOne));


        String [] studentTwo = new String[4];  // you don't know value
        System.out.println(Arrays.toString(studentTwo));

        studentTwo [0] = "010";
        studentTwo [1] = "Jamie";
        studentTwo [2] = "Bond";
        studentTwo [3] = "26";
        System.out.println(Arrays.toString(studentTwo));

       /* String [] studentThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ID");
        studentThree[0] = input.nextLine();
        System.out.println("Enter your first name");
        studentThree[1] = input.nextLine();
        System.out.println("Enter your last name");
        studentThree[2] = input.nextLine();
        System.out.println("What is your batch number");
        studentThree[3] = input.nextLine();
        System.out.println(Arrays.toString(studentThree)); */ // the same with loop down

        Scanner input = new Scanner(System.in);

        String [] studentFour = new String[4];
        String [] quest = {"Enter your ID", "Enter your name", "Enter your last name", "Enter your batch"};
        for (int i = 0; i < 4; i++){
            System.out.println(quest[i]); // reading each element of the question
            studentFour[i] = input.nextLine(); // assigning the Scanner input into our studentFour
        }
        System.out.println(Arrays.toString(studentFour));










    }
}

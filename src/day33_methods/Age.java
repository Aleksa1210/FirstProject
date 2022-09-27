package day33_methods;

import java.util.Scanner;

public class Age {


    public static void getAge(int year){
        System.out.println("Age: " + (2022 - year));


    }


    public static  void  main(String[] args){
        getAge(2000);

        int yersss = 1990;
        getAge(yersss);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year");
        getAge(input.nextInt()); // let me write in the cons

    }























}

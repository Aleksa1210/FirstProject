package day33_methods;

import java.util.Scanner;

public class Greeting {
    public static void hello(String name){

        System.out.println("hello " + name + " , how are you"); // name exist only here

    }
    public static  void  main(String[] args){

        //hello("James");
        //hello("Jamie");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name1 = input.nextLine();
        hello(name1);



    }

}

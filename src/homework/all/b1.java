package homework.all;

import java.util.ArrayList;
import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {


  /*  Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number");
    String num = input.nextLine();



    num = num.replace("^", " ");
    String[] arr = num.split(" ");
    String info = String.valueOf(arr[0]);
    int times = Integer.parseInt(arr[1]);
        for (int i = 1; i <= times; i++) {
        System.out.print("<" + info + "></" + info + ">");
    }
*/


        String name = "div^2";
        name = name.replace("^", " ");
       //System.out.println(name);

        String [] split = name.split(" ");
     //   System.out.println(name);
        int repeat = Integer.parseInt(split[1]);
        String word = String.valueOf(split[0]);
        // System.out.println(word);
        // System.out.println(repeat);


        for (int i = 0; i < repeat; i++){
            System.out.println("<" + word + "></" + word + ">");
        }











    }
}


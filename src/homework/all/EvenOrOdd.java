package homework.all;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an number");
        int num = input.nextInt();
        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 != 0; // boolean isOdd1 = num % 2 == 1
        // isOdd = !isEven;

        System.out.println(num + " Is even " + isEven);
        System.out.println(num + " Is odd:" + isOdd);





    }


}

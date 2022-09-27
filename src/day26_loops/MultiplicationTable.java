package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        int a = 0;



        for (int j = 1; j <= 10; j++){
            System.out.println(1 + " x " + j + " = " + (1 * j));
        }
        for (int i = 1; i <= 10; i++){
            System.out.println(2 + " x " + i + " = " + (2 * i));
        }

        System.out.println("___________________________________");

        for (int num = 1; num <= 3; num++){

            for (int multi = 1; multi <= 5; multi++){
                System.out.println(num + " + " + multi + " = " + (num * multi));
            }
            System.out.println();
        }









    }
}

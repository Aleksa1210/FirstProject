package day21_loops;

public class Factorial {
    public static void main(String[] args) {

        int num = 5;
        int result = 1;

        // 5 * 4 * 3 * 2 * 1 - factorial 5!
        //repeated action: multiply the numbers by one less than it
        //stopping point: number gets to 1

        while (num > 1){
            System.out.println(result + " * " + num);
            result *= num; // result = result * n
            num--;

        }
        System.out.print(result);



    }
}

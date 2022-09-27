package day27_loops;

public class PrimeInRange {
    public static void main(String[] args) {
        /* Prime in range
        Given a number. Print out all the prime numbers from 2 to that number A
        prime number is a number that is only divisible by 1 and itself.
        Ex:
        Input:
        50
        Output:
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 */


        int range = 50;


        for (int i = 2; i <= range; i++){ //the purpose of this loop is to check all the numbers from 2 to the value the range variable

            int count = 0; // putting the counter inside the outer loop will reset it back to 0 for the next number


            for (int j = 2; j < i; j++){ // prime 5? 2-5

                if (i % j == 0){
                    count++;
                }
                /* i = 5
                j = 2; j < 5; j++;

                i % J
                5 % 2
                5 % 3
                5 % 4
                count - 0; it's prime

                =====
                * i = 6
                j = 2; j < 6; j++;
                i = 6
                6 % 2 --> count++; became 1
                6 % 3 ---> count++; became 2
                6 % 4
                6 % 5
                 */

            } // end of inner loop

            if (count == 0){
                System.out.print(i + " ");
            }


        }








    }
}

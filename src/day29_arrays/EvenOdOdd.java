package day29_arrays;

public class EvenOdOdd {
    public static void main(String[] args) {


        /*Even and odd from array
        Write a program that can count the even and odd number from an array of
        integers
        Ex:
        Input: [4,1,3,12,5]
        Output: Even: 2
        Odd: 3 */


        int [] nums = {4, 1, 3, 12, 5};
        int even = 0;
        int odd = 0;
        String evenNum = "";
        String oddNum = "";

        for (int i = 0; i < nums.length; i++){

            if (nums[i] % 2 == 0){
                even++; // count how many even
                evenNum += nums[i] + " "; // write exactly number of even
            } else {
                odd++; // count how many odd
                oddNum += nums[i] + " "; // write exactly number of odd
            }
        }


        System.out.println();
        // example 2 for each

        for (int number : nums){

            if (number % 2 == 0){
                even++; // count how many even
                evenNum += number + " "; // write exactly number of even
            } else {
                odd++; // count how many odd
                oddNum += number + " "; // write exactly number of odd
            }
        }



        System.out.println(" even count " + even );
        System.out.println("even numbers " + evenNum);
        System.out.println(" even count " + odd );
        System.out.println(" odd number "  + oddNum);












    }
}

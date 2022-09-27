package day37_wrapper_arraylist;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 2,550,000,000 results (1.00 seconds)";
        String [] arr = result.split(" ");
        // System.out.println(Arrays.toString(arr));
        String resulStr =arr[1].replace(",", "");// delete , in the number
        String timeStr = arr[3].substring(1); // we can use replace too ( (100  ) - to delete (
        System.out.println(resulStr);
        System.out.println(timeStr);

        long resulNumber = Long.parseLong(resulStr); // we can't use int because number more than int // make long number
        double timeNumber = Double.parseDouble(timeStr);

        if (resulNumber >= 0){
            System.out.println("test case passed - positive number");
        }

        if (timeNumber < 2 && timeNumber >= 0){
            System.out.println("test case passed - under 2 second");
        }











    }
}

package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers do you want to start with ");
        int size = input.nextInt();
        int [] nums = new int[size];

        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter number ");
            nums[i] = input.nextInt(); // for repeat
        }
        System.out.println(Arrays.toString(nums));


        int [] expanded = Arrays.copyOf(nums, nums.length + 1); // or size
        System.out.println("Enter the last number ");
        expanded [expanded.length - 1] = input.nextInt(); // added to lass value
        System.out.println(Arrays.toString(expanded));





















    }
}

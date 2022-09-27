package day39_arrayList;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);
        nums.add(100);
        System.out.println(nums.indexOf(100)); // give first 100
        System.out.println(nums.indexOf(700)); // not exist

        System.out.println(nums.lastIndexOf(100)); // give last 100

        // middle 100
        nums.remove((Integer) 100);
        System.out.println(nums.indexOf(100));

        // or such
        nums.set(nums.indexOf(100), 0);
        System.out.println(nums.indexOf(100));















    }
}

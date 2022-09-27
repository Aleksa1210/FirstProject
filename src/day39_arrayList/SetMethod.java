package day39_arrayList;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);


        nums.set(0, -10);
        System.out.println(nums);
        nums.set(2, 5000);
        System.out.println(nums);









    }
}

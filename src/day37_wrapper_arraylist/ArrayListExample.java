package day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers  = new ArrayList<>();
        System.out.println(numbers);
        numbers.add(100); // adds 100 to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(-99); // adds -100 to the end of the ArrayList
        System.out.println(numbers);
// array [] = value; add/assign to an array
        numbers.add(50);
        numbers.add(40);
        System.out.println(numbers);

        // im array hoe do access each element: arr[index]

        numbers.get(0);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
       // System.out.println(numbers.get(20)); out of bounds

        // how do you know how many elements are in the array: arr.length
        // is length a method --> no


        System.out.println(numbers.size());









    }


}

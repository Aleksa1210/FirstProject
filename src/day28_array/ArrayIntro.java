package day28_array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // with normal variables

        String cityOne = "Chicago";
        String cityTwo = "New York";
        String cityThree = "Houston";
        String cityFour = "Denver";
        String cityFive = "Pittsburgh";

        // declare array with values


        String [] city = {"Chicago ", "New York ", "Houston ", "Denver ", "Pittsburgh"}; // first way
        String [] city2 = {cityOne, cityTwo, cityThree, cityFour,cityFive}; // or second way, we can do such



        // how to access each element in the array
        System.out.println(city[0]);
        System.out.println(city[1]);
        System.out.println(city[3]);
        System.out.println(city[4]);


        // print all cities in one line

        System.out.println("reverse order of the cities " + city[4] + ", " + city[3] + ", " + city[2] + ", " + city[1] + ", " + city[0]);

        // print the array all at one time
        System.out.println(city); // this doesn't print the array how we want
        System.out.println(Arrays.toString(city)); // this method from Arrays class lets you print the array  fully

        //numbers of elements;

        System.out.println(city.length); // how many elements










    }
}

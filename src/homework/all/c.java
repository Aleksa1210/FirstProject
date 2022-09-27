package homework.all;

import java.util.ArrayList;

public class c {
    public static void main(String[] args) {
    /*
    Create an ArrayList of Strings
    add these elements:add Hat add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat
    Print the ArrayList after each action to see how the change is made
    */

        ArrayList<String> store = new ArrayList<>();
        store.add("Hat");
        store.add("Shoes");
        store.add(1, "Jacket");
        store.add(0, "Towel");
        store.add(1, "Car");
        System.out.println(store);



        /*
        Practice flow:
    Create an ArrayList of Strings
    add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye
    remove Thor by index
    remove Iron Man by element
    remove the first index
    Print the ArrayList after each action to see how the change is made
         */

        ArrayList<String> store2 = new ArrayList<>();
        store2.add("Iron Man");
        store2.add("Spider Man");
        store2.add("Thor");
        store2.add("Captain America");
        store2.add("Hawkeye");

        System.out.println(store2);
        store2.remove("Iron Man");
        System.out.println(store2);
       store2.remove(1);
        System.out.println(store2);

        /*
        Create an ArrayList of Characters
    Fill the ArrayList with letters from A-Z
    Print the ArrayList of all the characters
         */


        ArrayList<Character> name = new ArrayList<>();
        name.add('A');

         for (Character i = 'A'; i <= 'Z' ; i++){
             System.out.print(i + " ");
             name.remove(1);
         }
        System.out.println();


         /*
         Create an ArrayList of Characters
    Fill the ArrayList with letters from a-z
    Print the ArrayList of all the characters
    Manually remove each vowels and print the new ArrayList
          */


        ArrayList<Character> name2 = new ArrayList<>();
        name.add('a');

        for (Character i = 'a' ; i <= 'z' ; i++){

            System.out.print(i + " ");


        }

        System.out.println();




    }
}

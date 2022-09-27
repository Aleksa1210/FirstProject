package day39_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {


        ArrayList<String> listone = new ArrayList<>();
        listone.add("Hello");
        listone.add("Bye");
        System.out.println(listone);


        ArrayList<String> listTwo = new ArrayList<>(listone); // adds the elements from the ListOne ArrayList into the ListTwo
        listTwo.add("Nola");
        System.out.println(listTwo);
        System.out.println(listone);


        ArrayList<String> ListThree = new ArrayList<>(Arrays.asList("one", "two", "three"));
        ListThree.add("cream");
        System.out.println(ListThree);










    }
}

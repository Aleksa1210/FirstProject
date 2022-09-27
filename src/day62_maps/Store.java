package day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {


        Map<String,Double> store = new HashMap<>();
        store.put("Water", 1.5); // water - is key
        store.put("Coffee", 2.5); // coffee is key
        store.put("Apples", 0.99);
        store.put("Bread", 2.35);
        store.put("Cucumbers", 3.89);


        System.out.println("Store Inventory");

// return the set of keys, then we use those key to get information from the map

       // for (String keys : store.keySet()){ //keySet() return key which use  // String because key is string
      //      System.out.println("Item " + keys + " for $" + store.get(keys)); //  + store.get(keys) - give value(1.5) // iam using get method from the map to get the value based on the key
       // }


        for (Map.Entry <String, Double> keys : store.entrySet()){ // return the entry(key/value pairs) from the map
            System.out.println("Item " +  keys.getClass() + " for $" + keys.getValue()); //  + store.get(keys) - give value(1.5)
            // getValue method is method from the Entry, which gives value of the current entry
        }
        System.out.println(store.values()); // return value from maps as a collection type



        Scanner input = new Scanner(System.in);
        System.out.println("What item do you want?");
        String item = input.nextLine();
        System.out.println(store.containsKey(item) ? item + " is in stock $ " + store.get(item) : "not available in the store");





    }
}

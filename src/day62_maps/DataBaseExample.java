package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {


        /*
        Database - hold information


                FIRST_NAME: James
                LAST_NAME: Bond
                BATCH: 7
         */

        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", "James");
        map.put("LAST_NAME", "Bond");
        map.put("BATCH", "7");

        System.out.println(map);

        //
        List<Map<String, String>> list = new ArrayList<>();
        list.add(map); // index 0
        list.add(makeMap("Shina", null, "26"));// index 1
        list.add(makeMap("Irina", "Petrovna", "20"));// index 2
        list.add(makeMap("Marina", "Ivanovna", "18"));// index 3
        list.add(makeMap("Ivan", "Tem", "17"));// index 3
        list.add(makeMap("Andrey", "Bond", "28"));// index 3


        // how can I check last name of the map I just added
        System.out.println(list.get(1).get("FIRST_NAME")); // first get is from the list by index, then we have the get method from map to give the value by the key
        System.out.println(list.get(1).get("LAST_NAME"));

        System.out.println("____________________________");

        // Go throw the ArrayList of Map elements - the map elements are the information for each person
        for (Map<String, String> each : list) { // print all information
            System.out.println(each);
        }


        System.out.println("==============================");

        // Go throw all the people and print all the first name
        for (Map<String, String> each : list) {
            System.out.println(each.get("FIRST_NAME"));// each is each map, the maps are the people's information
        }


        System.out.println("==============================");

        // Go throw all the people who in Batch 20 or above
        for (Map<String, String> each : list) {
            if (Integer.parseInt(each.get("BATCH")) >= 20){// convert string batch in the number
                System.out.println(each.get("BATCH"));// each is each map, the maps are the people's information
            }
        }

        System.out.println("____________________________");

        // Print information about of the last person in my List
            System.out.println("first name " + list.get(list.size() - 1).get("FIRST_NAME"));// the first get  call is the List method, to get the element based on the index
        System.out.println("last name " + list.get(list.size() - 1).get("LAST_NAME"));// the second get method is from map, to get the value based on the key
        System.out.println("Batch " + list.get(list.size() - 1).get("BATCH"));




    }

    public static Map<String, String> makeMap (String ... values){
        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", values[0]);
        map.put("LAST_NAME", values[1]);
        map.put("BATCH", values[2]);
        return map;
    }

}

package day61_maps;

import java.util.*;

public class Countries {
    public static void main(String[] args) {


        Map<String, ArrayList<String>> countries = new HashMap<>(); // ArrayList<String> - value

        // created a HasMap that has key of String type - countries and ArrayList<String>>  for the value and those will be cities


        countries.put("USA", new ArrayList<>(Arrays.asList("Chicago", "NYC","Dallas","DC", "Denver", "LA")));
        countries.put("Turkey", new ArrayList<>(Arrays.asList("Istanbul", "Ankara","Izmir")));
        countries.put("Canada", new ArrayList<>(Arrays.asList("Quebec", "Toronto","Vancouver")));
        System.out.println(countries);


        // Print all cities started with D or I

        for (ArrayList<String> cities : countries.values()){ // the loop go (iterates) through the value of the map, which are the ArrayList of the cities

            for (String eachCities : cities){ //go (iterates) through each in city in each ArrayList value

                if (eachCities.startsWith("D") || eachCities.startsWith("I")){
                    System.out.println(eachCities);
                }

            }
        }


        System.out.println();
        System.out.println("What country do you want to tour?");
        Scanner input = new Scanner(System.in);
        String country =input.nextLine();

        for (String cities : countries.get(country)){ // run all cities from country
            System.out.println("Touring..." + cities);

        }








    }
}

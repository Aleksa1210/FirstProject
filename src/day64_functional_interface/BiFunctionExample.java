package day64_functional_interface;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {


        // compare two numbers, find the biggest one

        // first twi types are your parameters types, and last one is return type
        BiFunction <Integer, Integer, Integer> maxNumber = (one, two) -> {
          return one > two ? one : two;
        };

        System.out.println(maxNumber.apply(4, 6));

        //List<Integer> -> key -> first parameter
        // List<String> -> value -> second parameter
        // Map<Integer, String> -  return
        BiFunction <List<Integer>, List<String>, Map<Integer, String>> createMap = (keys, value) -> {

            Map<Integer,String>  map = new HashMap<>();
            for (int i = 0; i < keys.size(); i++){
                map.put(keys.get(i), value.get(i));
            }
            return map;
        };


        List <Integer> key = new ArrayList<>(Arrays.asList(1, 2, 3,4));
        List<String> value = new ArrayList<>(Arrays.asList("James", "Ana", "Emre", "Gine"));
        System.out.println(createMap.apply(key, value));














    }
}

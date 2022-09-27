package day64_functional_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {


        BiConsumer <String, Integer> examplePrint = (str, num) -> { // BiConsumer - 2 arguments, not return, just print

            for (int i = 0; i < num; i++){
                System.out.println(str);
            }
        };
        examplePrint.accept("java", 5);


        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2); // two = 3 + 1 = 4
        map.put("three", 7);

        //forEach() is a method defind in the map intereface which allows you to defind theBiConsumer implementation you want to execute with keys and values. Interally it uses a for each loop to iterate through the entry set
        map.forEach((key, value) -> {
           // System.out.println(key + " " + value);
            System.out.println(value + key.length());
        });












    }
}

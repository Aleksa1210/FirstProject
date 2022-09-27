package day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {
    public static void main(String[] args) {


        Consumer <Integer> printToN = n -> {
          for (int i = 0; i <= n; i++){
              System.out.print(i + " ");
          }
        };

        printToN.accept(50); // accept() is the abstract method
        System.out.println();



        List<String> list = new ArrayList<>(Arrays.asList("Hello", "Summer", "Pool", "warm"));
        list.forEach(e -> System.out.println(e)); // print like which element // print each object
        list.forEach(e -> {    // print each first and last characters
            System.out.println(e.charAt(0) + " " + e.charAt(e.length()-1));
        });



    }
}

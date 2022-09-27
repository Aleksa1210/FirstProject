package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // creating Streams
        int [] arr = {1,2,3,4,5};
        Arrays.stream(arr);


        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 6,7 ,2));
        list.stream(); // convert to stream
        // distinct(): remove duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,4,4,5, 5));
        System.out.println(list2.stream().distinct().collect(Collectors.toList()));
        // list2 = list2.stream().distinct().collect(Collectors.toList())); // reassigning fine
        // convert to stream +USE THE METHODS + collect+ Collectors
        // .stream(); // convert to stream
        // .distinct() remove duplicate
        // .collect(Collectors.toList() - convert stream back to a list
        System.out.println("original list" + list2);

        System.out.println("=================================");

        //toArray
        int [] arr2 = {1,1,1,2,2,2,4,4,5, 5};
        arr2 = Arrays.stream(arr2).distinct().toArray(); // convert use toArray
        System.out.println("array " + Arrays.toString(arr2));


        System.out.println("==============================");

        //skip() - skip of defined number of elements
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list3.stream().skip(4).collect(Collectors.toList()));
        System.out.println(list3); //original
        System.out.println(list3.stream().skip(7).collect(Collectors.toList())); // not change original we have 2 version


        String [] arr3 = {"java", "hello", "world", "pen", "computer"};
        System.out.println(Arrays.toString(Arrays.stream(arr3).skip(3).toArray()));

        System.out.println("================================");


        // limit - what we want to keep // keeping a certain amount of element
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list4.stream().limit(6).collect(Collectors.toList()));
        System.out.println(list4.stream().limit(5).skip(3).collect(Collectors.toList()));
        System.out.println(list4.stream().skip(3).limit(4).collect(Collectors.toList()));


        System.out.println("===================================");
        //count - al,most like sixe, but sizw it's String method
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,4,5,6,3,5));
        System.out.println(list5.stream().count());
        System.out.println(list5.stream().distinct().count());



        // Task: find how many unique letters characters there is
        String s = "aaaabbbbccccdddeee";
        System.out.println(Arrays.stream(s.split("")).distinct().collect(Collectors.toList()));
        // I could have also done .toArray() instead of collect method
        System.out.println(Arrays.stream(s.split("")).distinct().count()); // convert to array














    }
}

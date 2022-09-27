package WorkExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovDuplEasy {
    public static void main(String[] args) {


        // creating Streams
        int [] arr = {1,2,3,4,5};
        Arrays.stream(arr);


        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 6,7 ,2));
        list.stream(); // convert to stream


        // distinct(): remove duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,4,4,5, 5));
        System.out.println(list2.stream().distinct().collect(Collectors.toList()));
        // convert to stream +USE THE METHODS + collect+ Collectors
        // .stream(); // convert to stream
        // .distinct() remove duplicate
        // .collect(Collectors.toList() - convert stream back to a list

    }
}

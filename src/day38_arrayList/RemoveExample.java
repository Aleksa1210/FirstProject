package day38_arrayList;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list);


        list.remove(0); // returns: water, but we didn't use it
        System.out.println(list);
       //String x = list.remove(0); // returns: water example
       //System.out.println(x);    // returns: water example



        System.out.println(list.remove(list.size() - 1));
        // list.size() - 1 - last index, will remove last index "wood"
        System.out.println(list);

        list.remove("sun");
        System.out.println(list);


        list.add("light");
        list.add("light");
        System.out.println(list);

        list.remove("light");
        System.out.println(list);









    }
}

package day39_arrayList;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");

        //list.remove(0);
        String item = list.remove(0);// can see what is removed
        System.out.println(item); // can see what is removed
        System.out.println(list);

       // list.remove("mouse");
        boolean bool = list.remove("mouse");
        System.out.println(bool);
        System.out.println(list);












    }
}

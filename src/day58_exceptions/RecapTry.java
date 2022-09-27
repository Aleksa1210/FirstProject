package day58_exceptions;

import java.util.ArrayList;
import java.util.Locale;

public class RecapTry {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");

        try {
            System.out.println(list.get(1));

            String s = null;
            s.toLowerCase(Locale.ROOT);
        }catch (IndexOutOfBoundsException e){ // IndexOutOfBoundsException
            System.out.println("Index out of bounds catch block");
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("No object");
            e.printStackTrace();
        }
       // System.out.println(list);
        System.out.println("DONE");


        try {
            Thread.sleep(-3000);
        }catch (InterruptedException e) {
            System.out.println("Wrong number");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Last line for the sleepy try");
        }


    }
}

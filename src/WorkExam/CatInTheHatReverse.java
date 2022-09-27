package WorkExam;

import java.util.ArrayList;
import java.util.Arrays;

public class CatInTheHatReverse {
    public static void main(String[] args) {

        ArrayList<String>words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));

        for (int i = 0; i< words.size(); i += 2) {

            String temp = words.get(i);
            words.set(i, words.get(i + 1)); // storing " In to position i, 0
            words.set(i + 1, temp); // index 1

            //( in, " cat, "in", "the", "hat" it swap the indexes
            System.out.println(words);


        }}
}

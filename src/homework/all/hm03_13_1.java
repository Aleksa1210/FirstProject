package homework.all;

import java.util.Arrays;

public class hm03_13_1 {
    public static void main(String[] args) {


        String [] name = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"};

        for (int i = 0; i < name.length; i++){
            String country = name[i].trim();
            System.out.println(country.charAt(0) + country.charAt(0) - 1);
            System.out.println(country);

        }









    }
}

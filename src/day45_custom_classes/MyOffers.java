package day45_custom_classes;

import day44_custom_classes.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer first = new Offer("Google", "Texas", 200_000, true, 15);
        System.out.println(first);



        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(first);
        allOffers.add(new Offer("Amazon", "New Your", 180_000, true, 15));

        System.out.println(allOffers);
        System.out.println();

        Offer [] moreOffers = {
                new Offer("Apple", "Chicago", 230_000, false, 10) ,
                new Offer("Tesla", "Texas", 250_000, false, 20),
                new Offer("Facebook", "Florida", 230_000, false, 10) ,
        };
        allOffers.addAll(Arrays.asList(
                new Offer("Discord", "Chicago", 150_000,false, 13),
                new Offer("Netflix", "Canada", 170_000,true, 10)
                ));
        System.out.println();
        System.out.println(allOffers);


        ArrayList<Offer> salaries = new ArrayList<>(allOffers);
        salaries.removeIf(each -> each.salary < 170_000);
        System.out.println(salaries);
        System.out.println();

        ArrayList<Offer> fullTime = new ArrayList<>(allOffers);
        fullTime.removeIf(each -> !each.fullTime); // each.isFullT// ime == false
        System.out.println(salaries);

    }
}

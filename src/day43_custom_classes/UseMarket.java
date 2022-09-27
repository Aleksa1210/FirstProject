package day43_custom_classes;

public class UseMarket {
    public static void main(String[] args) {


    Market marker1 = new Market("Dry Erase", "Expo", "Red");
        System.out.println(marker1);


        /* Before
        Market marker1 = new Market();
        marker1.type = "Dry Erase";
        marker1.brand = "Expo";
        marker1.color = "Red"; */

}
}
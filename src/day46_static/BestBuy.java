package day46_static;

public class BestBuy {

    String location;

    static String headquarters = "Richfield, Minnesota, Unites States";
    static String day = "Wednesday";
    static int  numberOFComputer = 100;

    public BestBuy(String location){
        this.location =location;
    }

    public void openStore(){
        System.out.println("opening the " + location);
    }
    public static void reStock(){
        numberOFComputer += 20;
    }







}

package day46_static;

public class BestBuyStores {
    public static void main(String[] args) {


        System.out.println(BestBuy.headquarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOFComputer);



        BestBuy store = new BestBuy("Dak drive");
        System.out.println(store.location);// accessing to instance variable
        System.out.println(store.numberOFComputer);

        store.numberOFComputer--;
        System.out.println(store.numberOFComputer);


        BestBuy store2 = new BestBuy("Main st");
        System.out.println(store2.location);
        store2.numberOFComputer-= 5;
        System.out.println(store2.numberOFComputer);

        store2.location = "Fairfax";
        System.out.println(store.location);
        System.out.println(store2.location);

        BestBuy.reStock();
        System.out.println(BestBuy.numberOFComputer);
        store.reStock();
        System.out.println(BestBuy.numberOFComputer);

        // BestBuy.openStore; don't work
store.openStore();
store2.openStore();





    }
}

package day55_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {


        //All possible obj of TShirt

        TShirt tShirt = new TShirt(); // reference of itself
        tShirt.wear();

        Clothes tShirt2 = new TShirt(); //reference of parents
        tShirt2.wear();

        Object tShirt3 = new TShirt();
       //  tShirt3.wear(); Object class doesn't have reference  to the wear() method

     //   HasHood tShirt4 = new TShirt(); TShirt class does not implement HasHood interface, only implemented in the Jacket

//_______________________________________________________________________

        Jacket jacket = new Jacket();
        jacket.putOnHood();
        jacket.wear();


        Clothes jacket2 = new Jacket();
        jacket2.wear();
       // jacket2.putOnHood(); Clothes reference does not have access to putOnHood()

        Object jacket3 = new Jacket(); // reference of super class Object
       // jacket3.wear();
       // jacket3.putOnHood();
        // Object claas does not have reference to wear() ot putOnHood() methods


        HasHood jacket4 = new Jacket();
       // jacket4.wear(); HasHood reference does not have access to wear() method
        jacket4.putOnHood();

        System.out.println();


        buy(tShirt);
        buy(jacket);
        buy(new TShirt());
        buy(new Jacket());


    }
    public static void buy(Clothes clothes){
        if (clothes instanceof TShirt){
            System.out.println("Bought TShirt");
        }else if (clothes instanceof Jacket){
            System.out.println("Bought a cool jacket");
        }

    }
    // public static void buy(Jacket jacket){
   // public static void buy(TShirt tShirt){


}

package day55_polymorphism.shopping;
/*
Create a concrete class Amazon
Make the class final
Inherit OnlineShopping and implement all abstract methods
 */
public class Amazon extends OnlineShopping{

    @Override
    public void viewCart() {
        System.out.println("View Amazon cart");
    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println(b ? "Pay for shipping" : "Free shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buy item for Amazon");

    }

    @Override
    public void returnItem() {
        System.out.println("Return to Amazon drop location");
    }
    // Amazon is OnlineShopping
    //Amazon is a Shopping
    // Amazon is a Shipping
}

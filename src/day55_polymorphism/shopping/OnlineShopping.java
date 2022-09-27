package day55_polymorphism.shopping;
/*
Create an abstract class OnlineShopping
-Inherits Shopping and implement Shipping
-Does not need to implement and abstract methods
- Declare an abstract methods
viewCart()
 */
public abstract class OnlineShopping extends  Shopping implements Shipping{

    public abstract void viewCart();


}

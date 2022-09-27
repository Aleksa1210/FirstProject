package day58_exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException{ // uncheck exception

    //this is an unchecked exception because the parent is RuntimeException class
    public NotEnoughMoneyException(){
        super("not enough money in the account");
    }



public NotEnoughMoneyException (String msg){
        super(msg);
}

}

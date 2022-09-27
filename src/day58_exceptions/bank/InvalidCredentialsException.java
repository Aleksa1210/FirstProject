package day58_exceptions.bank;

public class InvalidCredentialsException extends  Exception{

    //this is checked exception because the parent is Exception class


    public InvalidCredentialsException (String msg){
        super(msg);
    }

}

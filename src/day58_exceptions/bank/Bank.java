package day58_exceptions.bank;

public class Bank {

    double balance;


    public void withdraw(double amountToTakeOut){

        if (amountToTakeOut > balance){
//NotEnoughMoneyException e = new NotEnoughMoneyException();
        throw new NotEnoughMoneyException("Balance only has " + balance);

        }

        balance -= amountToTakeOut;


        // in this method we throw checked exception, so they must be handled, but we created the class so we don't want to handle it. We use throes to allows the program to compile so the user of the class handle the exception
    }
        public void login (String username, String  password) throws InvalidCredentialsException { // throws ignore
        if (!username.equals("jame")){
            throw  new InvalidCredentialsException("Invalid user name"); // throw - close the part/stop program
        }

        if (!password.equals("007")){
            throw  new InvalidCredentialsException("Invalid password");
        }
            System.out.println("LOGIN");

}

}

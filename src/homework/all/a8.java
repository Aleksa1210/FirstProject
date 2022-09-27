package homework.all;

import java.lang.reflect.Array;

public class a8 {
    public static void main(String[] args) {
        String [] names = {"Nadir","Amir"};
        String [] passwords = {"123hjjp"};
        boolean ifValid = false;
        for(int i = 0, j = 0; i<names.length && j<passwords.length; i++, j++){
            if(names[i].equals("Nadir") && Character.isDigit(passwords[j].charAt(0))){
                ifValid=true;
            }
        }
        System.out.println(ifValid);
    }
}

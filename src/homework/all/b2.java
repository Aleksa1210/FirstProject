package homework.all;

public class b2 {
    public static void main(String[] args) {

        String password = "ma1tH2@#";
        int upper = 0, lower = 0, digital = 0, other = 0;
       // boolean creat = false;


        if (password.length() >= 8){
        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);


            if (Character.isLowerCase(letter)) {
                lower++;
            } else if (Character.isUpperCase(letter)) {
                upper++;
            } else if (Character.isDigit(letter)) {
                digital++;
            } else {
                other++;
            }
        }
        }
        if (lower >= 1 && upper >= 1 && other >= 1 && digital >= 1) {
            //creat = true;
            System.out.println(" Password creat");
        } else {
           // creat = false;
            System.out.println(" Incorrect password");
        }










    }
}

package WorkExam;

public class loginPassword {
    public static void main(String[] args) {

        String [] log = {"Aleksa"};
        String [] password = {"12434"};

        boolean login = false;

        for (int i = 0, j = 0; i < log.length && j < password.length; i++, j++){
        if (log[i].equals("Aleksa") && Character.isDigit(password[i].charAt(0))){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        }




    }
}

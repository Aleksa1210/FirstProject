package WorkExam;

public class Palindrome {
    public static void main(String[] args) {


        String palindrom = "reccer";
        String rever = "";

        for (int i = palindrom.length() - 1; i >= 0; i--){
            rever += palindrom.charAt(i);
            System.out.println(rever);
        }
        if (rever.equals(palindrom)){
            System.out.println("Palindrom");
        } else {
            System.out.println("Not palindrom");
        }





    }
}

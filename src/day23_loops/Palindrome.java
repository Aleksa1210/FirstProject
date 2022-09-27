package day23_loops;

public class Palindrome {
    public static void main(String[] args) {



        String str= "racecar";
        // reverse the String
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i); //characters are being run from the end and being added backward into a reverse String reverse = reverse + str.charAt(i);




        }
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println(str.equals(reverse) ? "Palindrome" : "Not Palindrome");










    }
}

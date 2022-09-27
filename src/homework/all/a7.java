package homework.all;

public class a7 {
    public static void buildEmail (String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }



    public static  void  main(String[] args){
        buildEmail("arcaacra");
    }



}

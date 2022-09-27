package day29_arrays;

public class Initails {
    public static void main(String[] args) {

        /*
        Initials
        •Given an array of classmate’s names, first name and last separated by a
        space, print the initials of everyone
        Ex:
        Input: [ “James Bond”, “Eve Rell”, “Anna Johnson” ]
        Output: JB, ER, AJ */


        String [] name = {"James Bond", "Eve Rell", "Anna Johnson",       " Willy Orange"};

        for (int i = 0; i < name.length; i++){
            String fullName = name[i]; // or here .trim
            String secondWord = fullName.substring(fullName.indexOf(" ")).trim(); // indexOf (" ") +1; / .trim
            System.out.println("" + fullName.charAt(0) + secondWord.charAt(0));
        }


        // example each array
        for (String str : name){
            String fullName = str.trim();
            String secondWord = fullName.substring(fullName.indexOf(" ")).trim(); // indexOf (" ") +1; / .trim
            System.out.println("" + fullName.charAt(0) + secondWord.charAt(0));

            //System.out.println(str.trim().substring(0,1) + str.substring(str.indexOf(" ")).trim().charAt(0));
        }









    }
}

package day22_loops;

public class Letters {
    public static void main(String[] args) {

        // a-z lowercase

        char letter = 'a';

        while (letter <= 'z'){
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();





        // z - A uppercase

        char letter2 = 'Z';  // int i = 122

         while (letter2 >= 'A'){  // i >= 97
             System.out.print(letter2 + " "); // (char)i
             letter2--;
         }













    }
}

package WorkExam;

public class UniqueCharacter {
    public static void main(String[] args) {


        String name = "AAABBBCCCDEF";




        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            int count = 0;


            for (int j = 0; j < name.length(); j++) {
                char second = name.charAt(j);
                if (letter == second) {
                    count++;
                }  }


                if (count == 1) {
                    System.out.println(letter);
            }


            }








        }
}

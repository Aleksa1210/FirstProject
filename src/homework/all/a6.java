package homework.all;

public class a6 {

    public static void printEachCharacters(String word){
        for (int i = 0; i < word.length(); i++) {

            System.out.println(i + " --> "+ word.charAt(i));
        }
    }
    public static void main(String[] args) {
        String word = "CYDEO";
        printEachCharacters(word);
    }
}





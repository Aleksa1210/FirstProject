package day24_loops;

public class Syllables {
    public static void main(String[] args) {

        String str = "ja-va";
        int syllables = 1;


        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '-'){
                syllables++;
            }

        }
        System.out.println("syllables " + syllables);














    }
}

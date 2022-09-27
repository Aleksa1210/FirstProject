package homework.all;

public class hm03_08_2 {
    public static void main(String[] args) {
        String word = "AAABCCDEEF";
        String uniq = "BDF";


        for (int i = 0; i < word.length(); i++){
            int count = 0;
            char letter = word.charAt(i);

            if (!uniq.contains("" + letter)) {
                continue;
            }

            for (int j = 0; j < word.length(); j++){
                char eachLetter = word.charAt(j);

                if (word.contains("" + eachLetter)){
                count++;

                }
            }



            System.out.println(letter);




        }









    }
}

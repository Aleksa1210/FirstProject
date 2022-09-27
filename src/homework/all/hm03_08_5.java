package homework.all;

public class hm03_08_5 {
    public static void main(String[] args) {


        String word = "AAABCCDEEF";
        String un = "";


        for (int i = 0; i < word.length(); i++) {

            if (!un.contains("" + word.charAt(i))){
                un += word.charAt(i);
            }

            for (int j = 0; j < word.length(); j++) {

                if (word.contains(un)){

                }


        }
            System.out.println(un);
        }













    }
}

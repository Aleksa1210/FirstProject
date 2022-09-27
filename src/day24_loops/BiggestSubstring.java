package day24_loops;

public class BiggestSubstring {
    public static void main(String[] args) {


        String s = "aaabbbcccccddddee";
        String sub = ""; // aaa // bbb / ccccc // dddd/ ee
        String biggest = ""; // biggest is o, aaa > 0 ; aaa < ccccc ( ccccc is biggest)

        for (int i = 0; i < s.length() - 1; i++){

            sub += s.charAt(i);
            if (s.charAt(i) != s.charAt(i + 1)){  // a + 1 = b  -->  b + 1 --> c

                if (sub.length() > biggest.length()){
                    biggest = sub;
                }
                sub = ""; // resets this String for next substring bbb ( from aaa --> bbb)

            }
        }
        System.out.println(biggest);











    }
}

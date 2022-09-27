package day21_loops;

public class MiddleChar {
    public static void main(String[] args) {

        String s = "abcde";
                  //01234
        int len = s.length();
        int mid = s.length() / 2;

        if (s.length() % 2 == 0){
            // our word is even length
            char firstMiddle = s.charAt(s.length()/2 - 1);
                              // count 4 (5/2 -1)
            char secondMiddle = s.charAt(s.length()/2);
            System.out.println("with charAt: " + firstMiddle + secondMiddle);
            System.out.println("with substring: " + s.substring(mid - 1, mid + 1));
                               // all letters count - length  // diapason ( 6/2 - 1, 6/2 + 1)
                                                            // abcdef
                                                            // 012345
                                                            //   2,3

        } else {
            // our word is odd length
            char middle = s.charAt(s.length() / 2);
            System.out.println("with chartAt: " + middle);
            System.out.println("with substring: " + s.substring(len/2, len/2 +1));
        }











    }
}

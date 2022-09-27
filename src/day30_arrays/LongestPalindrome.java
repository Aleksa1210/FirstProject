package day30_arrays;

public class LongestPalindrome {
    public static void main(String[] args) {

         /*
    [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome
     */

        String [] palind = {"java", "longer word", "civic” “apple", "racecar", "mom", "anna"};
        String longest = "";
        int count = 0;


        // outer loop is iterating the array
        for (String eachWord : palind){
            boolean isPalindrome = true;


            // inner loop is iterating each String element
            for (int i = 0; i < eachWord.length()/2; i++){  //  /2 check only half


            if (eachWord.charAt(i) !=  eachWord.charAt(eachWord.length() - 1 - i)){
                isPalindrome = false;
                break;

            }
            }
            if (isPalindrome && eachWord.length() > longest.length()){
                longest = eachWord;
            }
        }

        System.out.println(longest.isEmpty() ? "no palindrome" : longest);  // or we can use if

       /* if (longest.isEmpty()){
            System.out.println("\"no palindrome\"");
        } else {
            System.out.println(longest);
        } */


        // "civic”
        //    if (eachWord.charAt(i) !=  eachWord.charAt(eachWord.length() - 1)){
        //  eachWord.charAt(i) !+ eachWord.charAt(5 -1 - 0) --> chatAt (4)
        //  c    !=   c
        //  eachWord.charAt(i) !+ eachWord.charAt(5 -1 - 1) --> chatAt (4) --> chatAt (3)
        // i != i












    }

}

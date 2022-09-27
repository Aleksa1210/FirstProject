package day24_loops;

public class CountChars {
    public static void main(String[] args) {


        String str = "2juMp41EEkd4s4";
        int upper = 0;
        int lower = 0;
        int number = 0;


        for (int i = 0; i < str.length(); i++){

           char varib = str.charAt(i); // get the character at the index number i for this iteration, and stores into the variable letter for re-usability

           if (varib >= 'A' && varib <= 'Z'){
               upper++;
           } else if (varib >= 'a' && varib <= 'z'){
               lower++;
           } else if (varib >= '0' && varib <= '9'){
               number++;
           }




        }
        System.out.println("Uppercase characters " + upper);
        System.out.println("Lowercase characters " + lower);
        System.out.println("Number characters " + number);













    }
}

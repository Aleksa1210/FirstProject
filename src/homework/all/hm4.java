package homework.all;

public class hm4 {
    public static void main(String[] args) {


       String str = "Hello?";
       int num = 0;
       for (int i = 0; i < 3; i++) {
           str += str.charAt(str.length() - 1); // Hello?
           num++;
        }
        System.out.println(str);











    }
}

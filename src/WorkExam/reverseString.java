package WorkExam;

public class reverseString {
    public static String reverseString (String str) {


   // str = "Hello";
    String retur = "";

    for (int i = str.length() -1; i >= 0; i--){
        retur += str.charAt(i);
    }
        return retur;


}

    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }

}

package homework.tutor;

public class a11 {

    public static String reverse(String str){
        String empty = "";
        for (int i = 0; i < str.length(); i++){
            String s = String.valueOf(str.charAt(i));
            empty = s + empty;  //
        }
        return empty;
    }

    // step -> tspe
    public static String reverseHalf (String st){
        String hold = "";
        for (int i = 1; i < st.length(); i+=2){
            String a = String.valueOf(st.charAt(i)); // t  // p
            String b = String.valueOf(st.charAt(i-1)); // s  // e
            hold = hold + a + b; // ts

        }
        return  hold;
    }


    public static void main(String[] args) {

        String s = "cars";
        String a = reverse(s);
        System.out.println(a);

        s = "step";
        a = reverseHalf(s);
        System.out.println(a);



    }




}

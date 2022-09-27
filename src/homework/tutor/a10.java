package homework.tutor;

public class a10 {
    public static void main(String[] args) {

        String a = "Hello"; //helo -> ehol
        String b = reverseString(a);
        System.out.println(b);

        a = "helo";
        b = reverseTwo(a);
        System.out.println(b);


        String str = "1237";
        int sum = 0;

        for (int i = 0; i < str.length(); i++){

            sum+= Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);
        System.out.println(sum);




        String duplicate = "AAABBBCCDDDEEE";
        String temp = "";
        for (int i = 0; i < duplicate.length(); i++){


            if (!temp.contains(String.valueOf(duplicate.charAt(i)))){
                temp += String.valueOf(duplicate.charAt(i));

            }

        }

        System.out.println(temp);


        System.out.println(returnString("FFHHOKKLPPPBBBN"));

    }


    public static String returnString(String a){

      //  String s = "FFHHOKKLPPPBBBN";

        String returns = "";

        for (int i = 0; i < a.length(); i++){

            if (!returns.contains(String.valueOf(a.charAt(i)))){
                returns += String.valueOf(a.charAt(i));
            }

        }

        return returns;
    }



    public static int countCharacters (String str){
        int coun = 0;
        for (int i = 0; i < str.length(); i++){
            coun++;
        }
        return coun;
    }


    public static String reverseString (String st){
        String hold = "";
        for (int i = 0; i < st.length(); i++){
            String s = String.valueOf(st.charAt(i)); // convert to String
            hold = s + hold;
        }
        return hold;
    }


    // helo -> ehol
    public static String reverseTwo (String st){
        String hold = "";
        for (int i = 1; i < st.length(); i+=2){ // i = i(1) + 2 = i3
            String s1 = String.valueOf(st.charAt(i)); // convert to String
            String s2 = String.valueOf(st.charAt(i-1)); // convert to String
            hold = hold + s1 + s2;
                        // e   h   // o  l
        }
        return hold;
    }








}

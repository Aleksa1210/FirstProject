package WorkExam;

public class a12Wrong {
    public static void main(String[] args) {

        //String - Remove Duplicates
        //Write a return method that can remove the duplicated values from String Ex: removeDup("AAABBBCCC") ==> ABC

        String str = "AAABBBCCC";
        String empty = ""; //A
        System.out.println(removeDup("AAABBBCCC"));


    }

    public static String removeDup(String str){

        String returnValue = "";
        for (int i = 0; i < str.length(); i++){
            if (!returnValue.contains(String.valueOf(str.charAt(i)))){
                returnValue+= String.valueOf(str.charAt(i)); // A
                // (str.charAt(i)); - A - Char
                // String.valueOf - A -> String
                // String += String
            }



        }
        return returnValue;
    }










}

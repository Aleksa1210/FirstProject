package homework.all;

public class a13 {
    //kate

    public static String reter (String str){
        String empty= "";
        for (int i = 1; i < str.length(); i+=2){
            String s1 = String.valueOf(str.charAt(i));
            String s2 = String.valueOf(str.charAt(i - 1));
            empty =  empty + s1 + s2;
        }
        return empty;
    }

    public static String char1 (String ch){
        String temp ="";
        for (int i = 0; i < ch.length(); i++){
            String s = String.valueOf(ch.charAt(i));
            if (!temp.contains(s)){
                temp += s;
            }
        }
        return temp;
    }

    public static Integer coun (String c){
        int sum = 0;
        for (int i = 0; i < c.length(); i++){
           sum += Integer.parseInt(String.valueOf(c.charAt(i)));

        }
      return sum ;
    }









    public static void main(String[] args) {
        String s = "kate";
        String s1 = reter(s);
        System.out.println(s1);


        String duplic ="AAHHHDDKKKKK";
        System.out.println(char1(duplic));


        String sum ="1233";
        System.out.println(coun(sum));
    }
}

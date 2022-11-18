package WorkExam;

public class FrequencyOFCharacters {
    public static void main(String[] args) {


        String name = "AAABBCDD";

        String checked = "";
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);

            if (checked.contains("" + letter) ){
                continue;

            }


            for (int j = 0; j < name.length(); j++){
                char eachLetter = name.charAt(j);

                if (letter == eachLetter){
                    count++;
                }
            }
            System.out.println(letter + " - " + count);
          checked+= letter; // (2)if we will not put, then will count all pp, eeee

        }











    }
}

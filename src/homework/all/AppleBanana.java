package homework.all;

public class AppleBanana {
    public static void main(String[] args) {



        String word1 = "apple";
        String word2 = "banana";


        int firstIndex = word1.indexOf('p');
        System.out.println(firstIndex);
        int lastIndex = word2.lastIndexOf('n');
        System.out.println(lastIndex);
        int secondIndex = word2.indexOf('a', firstIndex + 1); // start looks from index 2
        System.out.println(secondIndex);
        int thirdIndex = word2.indexOf('a', secondIndex + 1);
        System.out.println(thirdIndex);


        System.out.println(word1.substring(1));
        System.out.println(word2.substring(0, 5));



        String s = "shopping cart 131231";










    }
}

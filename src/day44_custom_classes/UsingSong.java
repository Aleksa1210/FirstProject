package day44_custom_classes;

public class UsingSong {
    public static void main(String[] args) {


        Song song1 = new Song("waka waka");
        System.out.println(song1);


        Song song2 = new Song("waka waka", 5);
        System.out.println(song2);

        Song song3 = new Song("waka waka", 5, "Britni");
        System.out.println(song3);



        Song song4 = new Song("waka waka", 5, "Britni", "male");
        System.out.println(song4);





    }
}

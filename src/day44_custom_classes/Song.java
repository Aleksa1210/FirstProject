package day44_custom_classes;

public class Song {


    String name, artist, genre;
    double length;

    public Song (String name){
        this.name = name;
    }

    public Song (String name, double length){
        // this.name = name;
        this(name);
        this.length = length;

    }

    public Song (String name, double length, String artist){
       // this.name = name;
        this(name, length);
       // this.length = length;
        this.artist =artist;
    }

    public Song (String name, double length, String artist, String genre){
      //  this.name = name;
      //  this.length = length;
        //this.artist = artist;
        this(name, length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song" +
                " name= " + name +
                ", artist = " + artist +
                ", genre= " + genre +
                ", length=" + length;
    }
}

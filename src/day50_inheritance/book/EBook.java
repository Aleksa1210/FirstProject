package day50_inheritance.book;

public class EBook extends Book{

    double size;
    int page;

    public void read(){
        System.out.println("Reading a digital " + title);
    }

}

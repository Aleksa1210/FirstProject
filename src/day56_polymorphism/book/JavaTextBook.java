package day56_polymorphism.book;

public class JavaTextBook extends EBook {
    /*
    Create a concrete Downloadable
    -Inherits EBook
    -Declare a fun variable
    -Override all abstract methods
     */

    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading java textbook");
    }

    @Override
    public void download() {
        System.out.println("Downloading java textbook");
    }

    @Override
    public void open() {
        System.out.println("Open java textbook");
    }
}

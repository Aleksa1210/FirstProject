package day56_polymorphism.book;

public abstract class EBook extends Book implements Downloadable{
    /*
    Create an abstract class Ebook
    -Inherits Book and implement Downloadable
    Declare a size variable
    Declare an abstract methods
    open()
     */


    double size;
    public abstract void open();

}

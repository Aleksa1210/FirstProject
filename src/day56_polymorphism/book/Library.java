package day56_polymorphism.book;

public class Library {
    public static void main(String[] args) {

        JavaTextBook book1 = new JavaTextBook();
        book1.fun = true;
        book1.name = "Java Programing";
        book1.size = 20.5;
        book1.read();
        book1.open();
        book1.download();

        EBook book2 = new JavaTextBook();
       // book2.fun = true; EBook reference does not have access to the fun
        book2.name = "Java Programing";
        book2.size = 20.5;
        ((JavaTextBook)book2).fun = true; // cast the reference from the parent EBook to the child reference of JavaTextBook and that allow us to access the fun variable
        book2.read();
        book2.open();
        book2.download();


        Book book3 = new JavaTextBook();
      //  book3.fun = true;
        book3.name = "Java Programing";
   //     book3.size = 20.5;
        book3.read();
  //      book3.open();
//        book3.download();

        // Book reference only has access to the name variable and the read variable

        Downloadable book4 = new JavaTextBook();
        //book4.fun = true; EBook reference does not have access to the fun
        //book4.name = "Java Programing";
        //book4.size = 20.5;
        //book4.read();
        //book4.open();
        book4.download();

        // The only thing accessible by the Downloadable interface is the download method

        JavaTextBook book5 = (JavaTextBook)book4;
        // book4 was interface reference, we cast reference to be a JavaTextBook and assigned it ti the book5 reference, after we can have access
        book5.read();
        book5.open();
        book5.fun = false;
        // from interface to class

    }
}

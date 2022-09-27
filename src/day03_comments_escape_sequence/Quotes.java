package day03_comments_escape_sequence;

public class Quotes {

    public static void main (String [] args ) {

        /*
        Q: How can you output this:
        I like "java" programming
         */

        /*
        the first quote is before java printing the text
        the second quote is to print the " quotation mark in the console
        */


        System.out.println("I like \"java\" programming");
        System.out.println("\"This is a quote\"");

        // I want to print backslash

        System.out.println("abc\\def");

       /* The first backslash is for syntax of escape characters
       The second backslash is for the backslash character to be output
       */

        System.out.println("abc\\\\def"); // this will print two backslash
        System.out.println("abc/def");
        System.out.println("abc\\\"def"); // this will print \\ "











    }
}

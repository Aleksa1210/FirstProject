package day08_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {

        int h = 5;
        int p = h; // p gets assigned the value of h, which is 5

        h++;

        System.out.println("h " + h);
        System.out.println("p " + p);

        int k = h++; // post increment, get the value first, which is 6 and assign it to the new variable k, so k has the value of 6. The h adds 1
        System.out.println("h" + h);
        System.out.println("k" + k);


        int g = ++h; // pre increment, which name it increment 1 right away, then it assigns the value from h to the new variable g
        System.out.println("g " + g);
        System.out.println("h " + h);



    }

}

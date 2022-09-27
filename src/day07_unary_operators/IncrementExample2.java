package day07_unary_operators;

public class IncrementExample2 {
    public static void main(String[] args) {

        int age = 20;
        System.out.println(age);  // 20
        System.out.println(age++); // we see 20, but it 21, we don't see it
        System.out.println(age);  // we see the 21

        System.out.println(age++); // 21 (22 we don't see)
        System.out.println(age);  // 22 we see

        System.out.println(++age); // 23



    }
}

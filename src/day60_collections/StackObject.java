package day60_collections;

import java.util.Stack;

public class StackObject {
    public static void main(String[] args) {


        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);


        System.out.println("Top of my stack " + stack.peek());  // return what at the top of your stack -> last element added
        stack.pop(); // removes the element at the top of the stack and returns it
        System.out.println(stack);
        System.out.println("Top of me stack " + stack.peek()); // returns what at the top of your stack -> last element added

        System.out.println(stack.pop()); // removes c which is at the top of the stack and returns it
        System.out.println(stack);

        System.out.println(stack.remove(0));
        System.out.println(stack);





    }
}

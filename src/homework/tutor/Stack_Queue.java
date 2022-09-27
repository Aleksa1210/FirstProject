package homework.tutor;

import java.util.Stack;

public class Stack_Queue {
    public static void main(String[] args) {


   // Queue<String> line = new LinkedList<>();
    Stack<String> line = new Stack<>();
    line.add("Bob");
    line.add("Lisa");
    line.add("Aleks");
    line.add("Robert");


    while (!line.isEmpty()){
       // String person = line.poll(); //remove but for Queue
        String person = line.pop(); // remove but for Stack
        System.out.println(person);

    }








    }

}

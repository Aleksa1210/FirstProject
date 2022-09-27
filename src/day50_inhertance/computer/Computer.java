package day50_inhertance.computer;

public class Computer {
    String os;
    int memory;


   /* public Computer(){
        // empty constructor
    } */

    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }
}

package day47_encapsulation;

public class UsingComputer {
    public static void main(String[] args) {


        System.out.println("Hello world");
        Computer comp = new Computer("Apple", "White", 500);
        System.out.println(comp);
        System.out.println(comp.brand);
        System.out.println(Computer.hasScreen);
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);

        //System.out.println(Computer.brand); tjis is not possible because brand it the intance variable and we are trying to access by the class name, but we need an object
        System.out.println(comp.hasMemory); // you can access static members from object reference because the object comes from the class, but in general you want access static members by the class name




    }
}

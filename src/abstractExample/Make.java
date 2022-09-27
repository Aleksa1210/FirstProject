package abstractExample;

public class Make {

    public static void main(String[] args) {

        Animal cat = new Animal() { // in line
            @Override
            void makeNoise() {
                System.out.println("myi");
            }
        };
        Animal d = new Dog();

    }
}

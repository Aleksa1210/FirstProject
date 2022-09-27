package homework.tutor;

interface Animal {

    void makeNoise();
    void  eat();






}

class Cat implements Animal{
    public void makeNoise(){
        System.out.println("miy");

    }
    public void eat(){
        System.out.println("eat use mouth");
    }


}

class Elephent implements Animal{


    @Override
    public void makeNoise() {
        System.out.println("yyyyyy");
    }

    @Override
    public void eat() {
        System.out.println("eat use nose");
    }
}


public class Interface {
    public static void main(String[] args) {
        Animal a = new Cat();
       // a.eat(); the same 62
       // a.makeNoise();

        Animal b = new Elephent();
        Animal dog = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("gav");
            }

            @Override
            public void eat() {
                System.out.println("est use mouth");

            }
        };

        DoStuff(a);
        DoStuff(dog);
        DoStuff(b);


    }

    public static void DoStuff(Animal s){

        s.makeNoise();
        s.eat();
        System.out.println("___________________");
    }



}




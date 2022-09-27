package day49_inheritance;

import day49_inheritance.Animal;
import day49_inheritance.Dog;
import day49_inheritance.Lion;

public class Zoo {

    public static void main(String[] args) {


    Animal animal = new Animal();
    animal.species = "Generic Animals";
    animal.numberOfLegs = 0;
    animal.walk();


    Dog dog = new Dog();
    dog.species = "Dog";
    dog.numberOfLegs = 4;
    dog.walk();


    Lion lion = new Lion();
    lion.roar();
    lion.species = "Lion";
    lion.numberOfLegs = 4;
    lion.maneSize = 12;
    lion.walk();




    }


}

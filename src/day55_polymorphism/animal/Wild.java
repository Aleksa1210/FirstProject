package day55_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {


        // all possible reference/object of Lizard


        //itself
        Lizard lizard = new Lizard();
        lizard.eat();
        lizard.name = "Lizard";
        lizard.numberOfClaws = 10;
        lizard.skinColor = "camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numberOfClaws);
        System.out.println(lizard.skinColor);
        System.out.println();



        //super class  - reptile
       Reptile reptile = new Lizard();
       reptile.eat();
        reptile.name = "Lizard";
        reptile.numberOfClaws = 10;
      //  reptile.skinColor = "camo"; this doesn't work because Reptile reference does not have access to skinColor
        System.out.println(reptile.name);
        System.out.println(reptile.numberOfClaws);
     //   System.out.println(reptile.skinColor); this doesn't work because Reptile reference does not have access to skinColor
        System.out.println();


        //super class - animal
        Animal animal = new Lizard();
        animal.eat();
        animal.name = "Lizard";
      //animal.numberOfClaws = 10; this doesn't work because Animal reference does not have access to skinColor, numberOfClaws
      //animal.skinColor = "camo"; this doesn't work because Animal reference does not have access to skinColor, numberOfClaws
        System.out.println(animal.name);
        //System.out.println(animal.numberOfClaws); this doesn't work because Animal reference does not have access to skinColor, numberOfClaws
        //System.out.println(animal.skinColor);this doesn't work because Animal reference does not have access to skinColor, numberOfClaws
        System.out.println();

        /*
        We made 3 different object with 3 different references:
        Lizard(itself), Reptile(super class), Animal (super class)
        but when it comes to execution, the object implementation is run
         */



    }
}

package day55_polymorphism.interface_methods;

public class MacbookPro implements Mac {
    @Override
    public void turnOn() {
        System.out.println("Mac is turning on");
    }





    static class Runner{

        public static void main(String[] args){
            System.out.println(Mac.NAME);
            System.out.println(Mac.OS);
            // System.out.println(MacbookPro.NAME);
            // System.out.println(MacbookPro.OS);
            // Tou can access the static variables from the class reference, but you should use interface to access

            Mac.company(); // static method which has implementation
           // Mac.faceTime(); the default method

         //   Mac.turnOn(); not valid, need an object to call  this methods
            MacbookPro obj = new MacbookPro();
            obj.turnOn();
            obj.faceTime();
          //  obj.company(); //static methods from an interface are not inherited, so they cannot be accessed from object, only by the interface



        }

    }


}

package day58_exceptions;

public class PersonObject {
    public static void main(String[] args) {


        Person obg = new Person();
        obg.setAge(50);
        try {
            obg.setName("James Bond");  // handle exception
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(obg.getAge());
        System.out.println(obg.getName());



        Person obj2 = new Person(); // exception checked
        obj2.setAge(50);
        try {
            obj2.setName(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(obj2.getAge());
        System.out.println(obj2.getName());


    }
}

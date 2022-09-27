package day58_exceptions;

public class Person {

   private String name;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception { // throws like ignore // check exception shloud be handle with try catch
        if (name == null || name.isEmpty()) {
            throw new Exception("Name can't be null or empty");

        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age >= 120){
            throw new IllegalArgumentException("Age should be more than 0 or less then 120");
        }
        this.age = age;
    }
}

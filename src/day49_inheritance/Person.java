package day49_inheritance;

public class Person {

    String name;
    int age;
    String favoriteHobby;

    public void talk (){
        System.out.println(name + " you are talking");
    }

    @Override
    public String toString() {
        return " Person " +
                " name = " + name +
                ", age =" + age +
                ", favoriteHobby = " + favoriteHobby;
    }
}

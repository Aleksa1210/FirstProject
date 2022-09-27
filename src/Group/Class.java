package Group;

public class Class {
    public static void main(String[] args) {

        Student student1 = new Student("Mike", 123456 );
        student1.sendMessage();
        System.out.println(student1);

        Admin admin1 = new Admin("Alona", 567890);
        admin1.createChannel();
        System.out.println(admin1);





    }
}

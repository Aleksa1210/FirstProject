package day44_custom_classes;

public class UsingEmployee {
    public static void main(String[] args) {



        Employee person = new Employee("Aleksa","HR");
        person.goToMeeting();
        System.out.println(person);



        Employee person1 = new Employee("Aleksa",  121234, "HR",150_000);
        person1.goToMeeting();
        System.out.println(person1);




    }
}

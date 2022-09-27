package day44_custom_classes;

public class Employee {


    String name, jobTitle;
    int id;
    double salary;


    public Employee (String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }
    public Employee (String name, int id, String jobTitle, double salary){
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void goToMeeting(){
        System.out.println(name + " is going to a meeting");
    }


    public String toString(){
        return name + " - " + jobTitle + " - " + id + " - $" +salary;
    }









}

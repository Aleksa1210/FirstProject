package day51_inhertitance.app;

public class App { // App is an Object
    String name;
    double version;

    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void download(){
        System.out.println(name + " Is downloading " + version);
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}

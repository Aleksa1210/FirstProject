package Group;

public class DiscordUser {
   /* Create an DiscordUser class
    - create variables:
    role, name, id
    - create constructor to initialize the variables
    - create a toString() method



  */

    String role; // create  instance variables:
    String name; // create  instance variables:
    int id;      // create  instance variables:

    public DiscordUser(String role, String name, int id) {  //
        this.role = role;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User " + "role =" + role + ", name='" + name + ", id=" + id;
    }
}

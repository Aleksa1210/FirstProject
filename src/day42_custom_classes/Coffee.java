package day42_custom_classes;

public class Coffee {

    String brand, type;
    double size;
    double price;

    public void drink(){
        System.out.println(" Drinking " + type);
    size -= 1.5; // every time when drink it getting few
    }


    public void refill(double amount){
        System.out.println("Refilling " + amount + " oz of coffee");
        size += amount;
    }

    @Override
    public String toString() {
        return type + "from: " + brand + " size of " + size + " oz. For a total price of = " + price;
    }



    /* public void refill2(double size){
        System.out.println("Refilling " + size + " oz of coffee");
        size += size;}
        this update the local size from the parameter, not instance size
        don't allowed has the same name
     */
}

package day43_custom_classes;

public class Carpet {

    double width, length, unitPrice;
    boolean isPersian;
    double totalPrice;


    public Carpet(boolean inputPersian, double inputWidth, double inputLength, double inputUnitPrice) {
        isPersian = inputPersian;
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
     calculatePrice();
    }

        public void calculatePrice(){
        totalPrice = width * length * unitPrice;

        if (isPersian){
            totalPrice += 200;
        }
    }

        public String toString(){
        return (isPersian ? "The Persian Carpet: " : "The Carpet ") + "\nhas dimensions of " + length + " x " + width + "\nThe price is " + unitPrice + "\nAll coming a total of $ " + totalPrice;
        }


}

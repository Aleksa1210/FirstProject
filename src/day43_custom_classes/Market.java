package day43_custom_classes;

public class Market {

    String type;
    String brand;
    String color;


    public Market(String inputType,  String inputBrand, String inputColor) {
        type = inputType;
        color = inputColor;
        brand = inputBrand;

    }


    @Override
    public String toString() {
        return "Market" +
                "type = " + type + '\'' +
                ", brand = " + brand + '\'' +
                ", color = " + color + '\'' ;
    }
}

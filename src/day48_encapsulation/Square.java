package day48_encapsulation;

public class Square {


  private int side;

    public Square(int side){
     setSide(side); // or if (side > 0) {
                     //   this.side = side;
    }


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }

    public int calculateArea(){
        return  side * side;
    }

    public int calculatePerimeter(){
        return side * 4;
    }


    public String toString(){
        return "Side of Square: " + side + " | Area: " + calculateArea() + " | Perimeter: " + calculatePerimeter();
    }



    // obj.getSide() !!! - look
    //cannot do obj.side


    // cannot do obj.side=value
    //obj. setSide(value) !!! - change









}

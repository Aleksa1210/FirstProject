package day47_encapsulation;

public class TrafficLight {

    private String color;

    public TrafficLight (String color) { //
        setColor(color);
    }


        public String getColor () { // return value
            return color;

        }

      public void setColor (String color){ // give value
            switch (color.toLowerCase()) {
                case "red":
                case "yellow":
                case "green":
                    this.color = color;
            }
        }


    }



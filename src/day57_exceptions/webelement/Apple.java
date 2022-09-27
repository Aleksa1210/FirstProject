package day57_exceptions.webelement;

import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {



    Form obj = new Form();
    Link obj2 = new Link();
    Input obj3 = new Input();
    Image obj4 = new Image();


    ArrayList <WebElement> element = new ArrayList<>();
    element.add(obj);
    element.add(obj2);
    element.add(obj3);
    element.add(obj4);

    for (WebElement each : element){
        System.out.println(each.getText());


        if (each instanceof Form){ // are you an object of Form
            ((Form) each).submit();
        }
    }

    WebElement logo = new Image();
    logo.click(); // click method is accessible by the WebElement interface reference, then execution happens on object side

   // logo.extension = ".png"; WebElement interface doesn't know (accessibility) to variable
        ((Image)logo).extension = ".png"; // cast logo(WebElement reference) to a Image reference, then the Image reference as access to the extension variable



}}

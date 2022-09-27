package day57_exceptions.webelement;

public class Input implements WebElement {

    @Override
    public void click() {
        System.out.println("Clicking the form");
    }

    @Override
    public String getText() {
        return "Sign Up";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Filling up the form");

    }
}

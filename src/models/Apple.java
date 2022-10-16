package models;

public class Apple extends Fruit {

    private String color;

    public Apple(String color) {
        super(1.0f);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}

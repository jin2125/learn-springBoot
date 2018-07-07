package org.springboot.learn.annotation;
import org.springboot.learn.annotation.FruitColor.Color;

public class Apple {
    @FruitName("Apple")
    private String name;

    @FruitColor(fruitColor = Color.RED)
    private String color;


    public void setColor(String appleColor) {
        this.color = appleColor;
    }
    public String getColor() {
        return color;
    }


    public void setName(String appleName) {
        this.name = appleName;
    }
    public String getName() {
        return name;
    }

    public void displayName(){
        System.out.println("fruit name = " + name + ", color = " + color);
    }

}

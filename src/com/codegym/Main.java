package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle(5, "white", false);
    Circle circle1 = new Circle(6, "white", true);
    Rectangle rectangle = new Rectangle(2, 3, "brown", false);
    Rectangle rectangle1 = new Rectangle(4, 6, "brown", true);
        List<Circle> circleList = new ArrayList<>();
        circleList.add(circle);
        circleList.add(circle1);
        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(rectangle);
        rectangleList.add(rectangle1);
        System.out.println("Before: ");
        for (Rectangle rectangle2 : rectangleList) {
            System.out.println(rectangle2.getArea());
            System.out.println(rectangle2.getPerimeter());
        }
        for (Circle circle2 : circleList) {
            System.out.println(circle2.getArea());
            System.out.println(circle2.getPerimeter());
        }
        System.out.println("After: ");
        for (Rectangle rectangle2 : rectangleList) {
            double a = rectangle2.getLength() * ((Math.random() * 99) + 1);
            rectangle.setLength(a);
            double b = rectangle2.getWidth() * ((Math.random() * 99) + 1);
            rectangle.setWidth(b);
            System.out.println(rectangle2.getArea());
            System.out.println(rectangle2.getPerimeter());
        }
        for (Circle circle2 : circleList) {
            double c = circle2.getRadius() * ((Math.random() * 99) + 1);
            circle2.setRadius(c);
            System.out.println(circle2.getArea());
            System.out.println(circle2.getPerimeter());
        }
    }

}

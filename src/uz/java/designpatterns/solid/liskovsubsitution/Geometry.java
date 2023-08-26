package uz.java.designpatterns.solid.liskovsubsitution;

import java.util.ArrayList;
import java.util.List;

public class Geometry {
    public static void main(String[] args) {
        List<Rectangle> shapes = new ArrayList<>();
        Square square = new Square();
        square.setHeight(1);
        square.setWidth(3);
        shapes.add(square);

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(1);
        rectangle.setWidth(3);
        shapes.add(rectangle);

        for (Rectangle shape : shapes) {
            System.out.println(shape.getHeight());
            System.out.println(shape.getWidth());
        }
    }
}

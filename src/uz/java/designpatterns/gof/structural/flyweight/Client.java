package uz.java.designpatterns.gof.structural.flyweight;

class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape[] shapes = {
                shapeFactory.getCircle("Red"),
                shapeFactory.getCircle("Blue"),
                shapeFactory.getCircle("Red"),
                shapeFactory.getCircle("Green"),
                shapeFactory.getCircle("Blue")
        };

        int x = 10;
        int y = 20;

        for (Shape shape : shapes) {
            shape.draw(x, y);
            x += 15;
            y += 15;
        }
    }
}

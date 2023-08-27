package uz.java.designpatterns.gof.structural.flyweight;

class Circle implements Shape {
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + "). " + this);
    }
}

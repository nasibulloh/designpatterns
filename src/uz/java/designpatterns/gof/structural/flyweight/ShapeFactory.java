package uz.java.designpatterns.gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class ShapeFactory {
    private final Map<String, Shape> shapeMap = new HashMap<>();

    public Shape getCircle(String color) {
        if (!shapeMap.containsKey(color)) {
            shapeMap.put(color, new Circle(color));
        }
        return shapeMap.get(color);
    }
}
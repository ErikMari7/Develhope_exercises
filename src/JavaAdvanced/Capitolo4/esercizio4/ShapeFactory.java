package JavaAdvanced.Capitolo4.esercizio4;

public class ShapeFactory {

    public static Shape getShape(ShapeType type ) {
        Shape shape = switch(type) {
            case Square -> new Square();
            case Circle -> new Circle();
            default -> null;
        };
        return shape;
    }
}

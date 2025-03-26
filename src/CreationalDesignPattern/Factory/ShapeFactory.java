package CreationalDesignPattern.Factory;

public class ShapeFactory {
    // Factory method that returns a specific Shape object based on the provided input
    Shape getShape(String input){
        switch (input){
            case "CIRCLE":
                return new Circle();
            case  "RECTANGLE":
                return new Rectangle();
            case  "SQUARE":
                return new Square();
            default:
                // Return NullShape if the input is invalid or unrecognized
                return new NullShape();
        }
    }
}

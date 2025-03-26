package CreationalDesignPattern.Factory;
// Main class to demonstrate the Factory Design Pattern
public class FactoryDesignPattern {
    public static void main(String[] args) {
        // Create an instance of the ShapeFactory class
        ShapeFactory shapeFactoryobj=new ShapeFactory();
        // Use the ShapeFactory to get an object of a specific shape (CIRCLE in this case)
        // The 'getShape' method will return a specific shape object based on the provided input string.
        Shape shapeobj = shapeFactoryobj.getShape("CIRCLE");

        // Call the 'draw' method on the shape object returned by the factory to demonstrate its functionality.
        shapeobj.draw();
    }
}
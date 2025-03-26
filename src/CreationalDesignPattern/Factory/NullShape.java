package CreationalDesignPattern.Factory;

public class NullShape implements Shape{
    @Override
    public void draw() {
        System.out.println("No shape to draw.");
    }
}

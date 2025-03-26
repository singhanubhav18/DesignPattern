package StructuralDesignPattern.ListOfPattern.DecoratedPatterns;

public class Mushroom extends BasePizza{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}

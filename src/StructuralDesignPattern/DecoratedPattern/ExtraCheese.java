package StructuralDesignPattern.DecoratedPattern;

public class ExtraCheese extends ToppingDecorate {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}

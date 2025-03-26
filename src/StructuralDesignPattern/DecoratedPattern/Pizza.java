package StructuralDesignPattern.DecoratedPattern;

public class Pizza {
    public static void main(String[] args) {
        // Start with a basic FarmHouse pizza
        BasePizza basePizza = new FarmHousePizza();

        // Decorate it with mushrooms
        BasePizza pizzaWithMushrooms = new Mushroom(basePizza);
        BasePizza pizzaWithMushroomsAndCheese = new ExtraCheese(new Mushroom(basePizza));



        // Print out the cost of the pizza with mushrooms
        System.out.println("Cost of FarmHouse Pizza with Mushrooms: " + pizzaWithMushrooms.cost());

        System.out.println("Cost of FarmHouse Pizza with Mushrooms and Cheese: " + pizzaWithMushroomsAndCheese.cost());

    }
}

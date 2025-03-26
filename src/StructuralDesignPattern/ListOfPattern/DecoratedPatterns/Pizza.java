package StructuralDesignPattern.ListOfPattern.DecoratedPatterns;

public class Pizza {
   // The Decorator Pattern is a structural design pattern that allows you to add behavior (or responsibilities) to an object dynamically without modifying its structure.
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

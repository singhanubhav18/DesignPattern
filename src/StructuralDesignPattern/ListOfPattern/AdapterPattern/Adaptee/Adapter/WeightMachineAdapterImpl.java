package StructuralDesignPattern.ListOfPattern.AdapterPattern.Adaptee.Adapter;

import StructuralDesignPattern.ListOfPattern.AdapterPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine; //Has-a RelationShip(Aggregation)

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getInKg() {
        double weightInPound=weightMachine.getWeightInPound();
        double weightInKg=weightInPound*.45;
        return weightInKg;
    }
}

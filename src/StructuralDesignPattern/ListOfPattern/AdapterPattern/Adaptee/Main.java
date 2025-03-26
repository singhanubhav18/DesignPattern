package StructuralDesignPattern.ListOfPattern.AdapterPattern.Adaptee;

import StructuralDesignPattern.ListOfPattern.AdapterPattern.Adaptee.Adapter.WeightMachineAdapter;
import StructuralDesignPattern.ListOfPattern.AdapterPattern.Adaptee.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        // It acts as a bridge between two incompatible interfaces, enabling them to communicate
        WeightMachineAdapter weightMachineAdapte=new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapte.getInKg());
    }
}

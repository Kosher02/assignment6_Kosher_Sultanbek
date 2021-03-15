package com.company.task3;

public class ModernFurnitureFactory implements FurnitureFactory {//implementing

    @Override
    public Chair createChair() {
        return new ModernChair();
    }//return the value
    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
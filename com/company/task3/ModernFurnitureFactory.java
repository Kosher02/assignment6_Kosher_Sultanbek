package com.company.task3;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
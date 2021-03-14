package com.company.task3;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
package com.homework;

public class CPU_Stock_Cooler extends Product {

    private String stockCooler;


    public CPU_Stock_Cooler(Integer productNumber, String productName, Integer numberOfUnitsInStock, double productPrice, String stockCooler) {
        super(productNumber, productName, numberOfUnitsInStock, productPrice);
        this.stockCooler = stockCooler;
    }

    public String getStockCooler() {
        return stockCooler;
    }

    public void setStockCooler(String stockCooler) {
        this.stockCooler = stockCooler;
    }

    @Override
    public double calculateInventoryValue() {
        return super.calculateInventoryValue() + (super.calculateInventoryValue() * 0.05);
    }

    @Override
    public String toString() {
        return
                "CPU Stock Cooler = " + stockCooler + '\'' +
                super.toString();
    }
}

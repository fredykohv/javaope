package com.homework;

public class Product {

    private Integer productNumber;
    private String productName;
    private Integer numberOfUnitsInStock;
    private double productPrice;
    private Vendor vendor;

    public Product(Integer productNumber, String productName) {
        this.productNumber = productNumber;
        this.productName = productName;
    }

    public Product(Integer productNumber, String productName, Integer numberOfUnitsInStock, double productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.numberOfUnitsInStock = numberOfUnitsInStock;
        this.productPrice = productPrice;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getNumberOfUnitsInStock() {
        return numberOfUnitsInStock;
    }

    public void setNumberOfUnitsInStock(Integer numberOfUnitsInStock) {
        this.numberOfUnitsInStock = numberOfUnitsInStock;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double calculateInventoryValue() {
        return this.numberOfUnitsInStock * this.productPrice;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return
                "Product number = " + productNumber +
                ", Product name = " + productName + '\'' +
                ", Number of units in stock = " + numberOfUnitsInStock +
                ", Product price = " + productPrice + "€" +
                ", " + String.format("Inventory value = %.2f", calculateInventoryValue()) + "€" + '\n' +
                ", Vendor = " + vendor + '\n' +
                        "----------------------" + '\n'
                ;
    }
}

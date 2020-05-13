package com.homework;

public abstract class Banana {

    private double bananaWeight;
    private Integer levelOfMaturity; //from 1-10
    private String ethnicityOfBanana; //Indian, Cavendish etc...
    private double basePriceOfBanana;

    //Integer shelfLife = 10 - levelOfMaturity;

    public Banana(double bananaWeight, Integer levelOfMaturity, String ethnicityOfBanana, double basePriceOfBanana) {
        this.bananaWeight = bananaWeight;
        this.levelOfMaturity = levelOfMaturity;
        this.ethnicityOfBanana = ethnicityOfBanana;
        this.basePriceOfBanana = basePriceOfBanana;
    }

    public Integer getLevelOfMaturity() {
        return levelOfMaturity;
    }

    public double calculatePriceOfBanana() {
        if (this.bananaWeight > 0.2) {
            return (shelfLife() * this.basePriceOfBanana) * 0.95;
            //return (basePriceOfBanana * shelfLife) * 0.95;
        } return this.basePriceOfBanana * shelfLife();
    }

    public abstract double shelfLife();

    @Override
    public String toString() {
        return
                "Weight of banana: " + bananaWeight + " kg " +
                ", Banana maturity level (1 - 10): " + levelOfMaturity +
                ", Ethnicity of banana: ' " + ethnicityOfBanana + '\'' +
                ", Banana base price: " + basePriceOfBanana + " € " +
                ", Banana's shelf life: " + shelfLife() + " days " +
                ", Banana's price: " + calculatePriceOfBanana() + " € "
                ;
    }
}

package com.homework;

public class Banana_India extends Banana {

    private double curvature; //0.0 ° - 45.0 °

    public Banana_India(double curvature, double bananaWeight, Integer levelOfMaturity, String ethnicityOfBanana, double basePriceOfBanana) {
        super(bananaWeight, levelOfMaturity, ethnicityOfBanana, basePriceOfBanana);
        this.curvature = curvature;
    }

    @Override
    public double shelfLife() {
        double shelfLife = (double)(10 - getLevelOfMaturity()) / 2;
        return shelfLife;
    }

    @Override
    public String toString() {
        return "Banana from India -> " +
                "The curvature of the banana: " + curvature + " ° " +
                super.toString()
                ;
    }
}

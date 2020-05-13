package com.homework;

public class Banana_Regular extends Banana {


    public Banana_Regular(double bananaWeight, Integer levelOfMaturity, String ethnicityOfBanana, double basePriceOfBanana) {
        super(bananaWeight, levelOfMaturity, ethnicityOfBanana, basePriceOfBanana);
    }

    @Override
    public double shelfLife() {
        Integer shelfLife = 10 - getLevelOfMaturity();
        return shelfLife;
    }

    @Override
    public String toString() {
        return "Regular banana -> " +
                super.toString()
                ;
    }
}

package com.company;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sisesta ringi raadius (cm): ");

        double radius = input.nextDouble();
        double diameter = radius * 2;

        double resultCircleP = Math.PI * diameter;
        resultCircleP = mult_P(Math.PI, diameter);

        double resultCircleS = Math.PI * (radius * radius);
        resultCircleS = mult_S(Math.PI, radius);

        double squareWidth = diameter;

        double resultSquareP = diameter * 4;
        resultSquareP = mult_Square_P(diameter);

        double resultSquareS = squareWidth * squareWidth;
        resultSquareS = mult_Square_S(squareWidth);



    }

    public static double mult_P (double radius, double diameter) {
        double resultCircleP = Math.PI * diameter;
        System.out.println("Ringi ümbermõõt on: " + resultCircleP + " cm!");
        return resultCircleP;
    }

    public static double mult_S(double pi, double radius) {
        double resultCircleS = Math.PI * (radius * radius);
        System.out.println("Ringi pindala on: " + resultCircleS + " cm²!");
        return resultCircleS;
    }

    private static double mult_Square_P(double diameter) {
        double resultSquareP = diameter * 4;
        System.out.println();
        System.out.println("Ruudu ümbermõõt on: " + resultSquareP + " cm!");
        return resultSquareP;
    }

    private static double mult_Square_S(double squareWidth) {
        double resultSquareS = squareWidth * squareWidth;
        System.out.println("Ruudu pindala on: " + resultSquareS + " cm²!");
        return resultSquareS;
    }
}

package com.company;

import java.util.Scanner;

public class Temperature {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature of your city:");

        int temperature = temperatureCheck(input.nextInt());
    }

    public static int temperatureCheck(int temperature) {
        if (temperature > 25) {
            System.out.println("Hot!");
        } else if (temperature < 10) {
            System.out.println("Cold!");
        } else if (temperature < 25 && temperature > 10 || temperature == 25 || temperature == 10) {
            System.out.println("Warm!");
        }

        return temperature;
    }
}

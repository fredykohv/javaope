package com.company;

import java.util.Scanner;

public class Palk {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sisesta oma palk: ");

        double wage = wageCheck(input.nextDouble());
        //wage = wageCheck(input.nextDouble());
    }

    public static double wageCheck (double wage) {
        if (wage >= 1000) {
           System.out.println("Sa ei ole palgatõusu jaoks kvalifitseeritud!");
        } else if (wage < 1000) {
            System.out.println("Sa kvalifitseerud 5% palgatõusule!");
            wage = wage * 1.05;
            System.out.println();
            System.out.println("Sinu uus igakuine palk peale palgatõusu on: " + wage + " €");
        }
        return wage;
    }
}

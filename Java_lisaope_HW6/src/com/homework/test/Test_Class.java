package com.homework.test;

import com.homework.Banana;
import com.homework.Banana_India;
import com.homework.Banana_Regular;

public class Test_Class {

    public static void main(String[] args) {

        Banana_India indiaBanana = new Banana_India(12, 0.22, 5, "Indian banana", 0.99);
        Banana_India indiaBanana2 = new Banana_India(7, 0.27, 2, "Indian banana", 0.99);
        Banana_India indiaBanana3 = new Banana_India(15, 0.21, 4, "Indian banana", 0.99);
        Banana_India indiaBanana4 = new Banana_India(13, 0.29, 7, "Indian banana", 0.99);
        Banana_India indiaBanana5 = new Banana_India(18, 0.2, 7, "Indian banana", 0.99);
        Banana_India indiaBanana6 = new Banana_India(21, 0.19, 8, "Indian banana", 0.99);
        Banana_India indiaBanana7 = new Banana_India(22, 0.33, 9, "Indian banana", 0.99);
        Banana_Regular regularBanana = new Banana_Regular(0.34, 2, "Cavendish banana", 0.89);
        Banana_Regular regularBanana2 = new Banana_Regular(0.38, 1, "Cavendish banana", 0.89);
        Banana_Regular regularBanana3 = new Banana_Regular(0.4, 5, "Cavendish banana", 0.89);

        Banana [] bananas = {indiaBanana, indiaBanana2, indiaBanana3, indiaBanana4,
                indiaBanana5, indiaBanana6, indiaBanana7, regularBanana, regularBanana2, regularBanana3};

        for (Banana banana : bananas) {
            System.out.println();
            System.out.println(banana);
            //System.out.println((double)(10 - 7) / 2);
        }

    }
}

package com.homework;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ProductTester {

    public static void main(String[] args) {

        Product Ryzen71700x = new Product(1, "Ryzen 7 1700x", 124, 189.99);
        Product Ryzen71800x = new Product(2, "Ryzen 7 1800x", 91, 209.99);
        Product Ryzen51500x = new Product(3, "Ryzen 5 1500x", 112, 119.99);
        Product Ryzen51600x = new Product(4, "Ryzen 5 1600x", 131, 159.99);
        Product Ryzen93900x = new Product(5, "Ryzen 9 3900x", 32, 310);
        Product Ryzen93950x = new Product(6, "Ryzen 9 3950x", 21, 369.99);

        Product[] products = {Ryzen71700x, Ryzen71800x, Ryzen51500x, Ryzen51600x, Ryzen93900x, Ryzen93950x};

        for (Product p : products) {
            System.out.println(p.toString());
        }

        Scanner scanner = new Scanner(System.in);

        List<Integer> productNumber = new ArrayList<Integer>();
        List<String> productName = new ArrayList<String>();
        List<Integer> numberOfUnitsInStock = new ArrayList<Integer>();
        List<Double> productPrice = new ArrayList<Double>();

        ArrayList<Product> productsAddedFromUser = new ArrayList<Product>();
        int totalAmmountOfAddedUserProducts = 0;

        System.out.println("Insert the ammount of products you would like to add: ");
        totalAmmountOfAddedUserProducts = scanner.nextInt();

        for (int i = 0; i < totalAmmountOfAddedUserProducts; i++) {
            System.out.println("Insert product number: ");
            productNumber.add(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Insert product name: ");
            productName.add(scanner.nextLine());

            System.out.println("How many units are in stock? ");
            numberOfUnitsInStock.add(scanner.nextInt());
            scanner.nextLine();

            System.out.println("How much does one unit cost? ");
            productPrice.add(scanner.nextDouble());
            scanner.nextLine();

            productsAddedFromUser.add(new Product(productNumber.get(i), productName.get(i), numberOfUnitsInStock.get(i), productPrice.get(i)));
            break;
        }

        for (int i = 0; i < productsAddedFromUser.size(); i++) {
            System.out.println(productsAddedFromUser.get(i).toString());
        }

        CPU_Stock_Cooler wraithStealth = new CPU_Stock_Cooler(1, "Ryzen 5 1400", 124, 109.99, "AMD Wraith Stealth");
        Vendor vendor = new Vendor("Arvutitark OÜ", "Tartu, Raatuse 20", "Arvutitark", "733 0059");
        wraithStealth.setVendor(vendor);
        System.out.println(wraithStealth.toString());

    }
}

package com.homework.warehouse;

import com.homework.product.Product;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Warehouse {

    private static ArrayList<Shelf> shelf;

    public Warehouse() {
        shelf = new ArrayList<Shelf>();
    }

    public void receive(Product product, String shelfName) {
        shelf.add(new Shelf(shelfName, product));
    }

    public String dispatch(Product product) {
        for (Shelf s : shelf) {
            if (s.getProduct().equals(product)) {
                shelf.remove(s);
                return s.getShelfName();
            }
        }
        return null;
    }

    public Integer getItemCount(Product product) {
        int productCount = 0;
            for (Shelf s : shelf) {
                if (s.getProduct().equals(product)) {
                    productCount++;
                }
            }
            return productCount;
    }

    public static void saveDataAsCSV(String filepath) {

        try {

            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (Shelf s : shelf) {
                pw.println(s.getShelfName() + ", " + s.getProduct().toString());
                pw.flush();
            }
            pw.close();
            JOptionPane.showMessageDialog(null, "Record saved");


        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Record not saved");
        }
    }
}

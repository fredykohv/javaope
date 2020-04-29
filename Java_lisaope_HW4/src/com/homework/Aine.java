package com.homework;

public class Aine {

    private String aineKood;
    private String aineNimetus;
    private int ainePunktideArv;

    public Aine(String aineKood, String aineNimetus, int ainePunktideArv) {

        this.aineKood = aineKood;
        this.aineNimetus = aineNimetus;
        this.ainePunktideArv = ainePunktideArv;

    }

    public Aine() {

    }

    public String getAineKood() {
        return aineKood;
    }

    public void setAineKood(String aineKood) {
        this.aineKood = aineKood;
    }

    public String getAineNimetus() {
        return aineNimetus;
    }

    public void setAineNimetus(String aineNimetus) {
        this.aineNimetus = aineNimetus;
    }

    public int getAinePunktideArv() {
        return ainePunktideArv;
    }

    public void setAinePunktideArv(int ainePunktideArv) {
        this.ainePunktideArv = ainePunktideArv;
    }

    public String toString() {
        String aineAndmed = "---------------" + "\nAine kood: " + aineKood + "\nAine nimetus: " + aineNimetus + "\nAinepunktide arv: " + ainePunktideArv;
        return aineAndmed;
    }

    public void tundideArv() {
        System.out.println(aineNimetus + "tundide arv: " + ainePunktideArv * 8);
    }
}





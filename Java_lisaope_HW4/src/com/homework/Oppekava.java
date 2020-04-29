package com.homework;

public class Oppekava {

    private String oppekavaKood;
    private Aine[] ained;

    public String getOppekavaKood() {
        return oppekavaKood;
    }

    public void setOppekavaKood(String oppekavaKood) {
        this.oppekavaKood = oppekavaKood;
    }

    public Aine[] getAined() {
        return ained;
    }

    public void setAined(Aine[] ained) {
        this.ained = ained;
    }

    public String toString() {
        String oppekavaAndmed = "Õppekava kood: " + oppekavaKood + "\n Ained: \n" + ainedToString(ained);
        return oppekavaAndmed;
    }

    private String ainedToString(Aine[] ained) {
        String string = "";
        for (Aine aine : ained) {
            string = string + aine + "\n";
        }
        return string;
    }
}

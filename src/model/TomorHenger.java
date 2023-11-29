package model;

public class TomorHenger extends Henger {

    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }    

    public double suly() {
        return super.terfogat() * fajsuly;
    }

    @Override
    public String toString() {
        String eredeti = super.toString();
        return eredeti + "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }

}
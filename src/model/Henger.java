package model;

public abstract class Henger {
    private int hengerDarab;
    private double sugar, magassag;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    public double terfogat(){
        
        return Math.PI*sugar*sugar*magassag;
        //terfogat kiszamitasa
    }

    @Override
    public String toString() {
        return "Henger{" + "hengerDarab=" + hengerDarab + ", sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
}

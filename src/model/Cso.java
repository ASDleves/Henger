package model;

public class Cso extends TomorHenger {

    private double falvastagsag;

    public Cso(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
    }

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public void setFalvastagsag(double falvastagsag) {
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        Henger belso = new Henger(getSugar() - falvastagsag, getMagassag());

        return super.terfogat() - belso.terfogat();
    }

    @Override
    public String toString() {
        String eredeti = super.toString();
        return eredeti + "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }

}

package model;

public class TomorHenger extends Henger{
    private double fajsuly;

    public TomorHenger(double sugar, double magassag,double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }
    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = 1.0;
    }

    

    public double getFajsuly() {
        return fajsuly;
    }
    public double suly(){
        
        return 0;
        
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }
    
    
    
}

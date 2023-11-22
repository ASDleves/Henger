
package model;

public class Cso extends TomorHenger{
    private double falvastagsag;

    public Cso(double sugar, double magassag, double fajsuly,double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag,double falvastagsag) {
        super(sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }
    
    public double terfogat(){
        
        return 0;
        
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
    
    
    
    
    
}

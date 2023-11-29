package model;

<<<<<<< HEAD
public class Henger {

=======
public abstract class Henger {
>>>>>>> 1ff0987e00ceec6b922d4639f61f487ab0ddae76
    private static int hengerDarab = 0;
    private double sugar, magassag;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
<<<<<<< HEAD
        hengerDarab++;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }
=======
         hengerDarab++;
    }

    public static int getHengerDarab() {
    return hengerDarab;
}
>>>>>>> 1ff0987e00ceec6b922d4639f61f487ab0ddae76

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
<<<<<<< HEAD

    public double terfogat() {
        return Math.pow(sugar, 2) * Math.PI * magassag;
=======
    public double terfogat(){
        
        return Math.PI*sugar*sugar*magassag;

>>>>>>> 1ff0987e00ceec6b922d4639f61f487ab0ddae76
    }

    @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }

}
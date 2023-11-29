package main;
import java.util.ArrayList;
import model.Cso;
import model.Henger;
import model.TomorHenger;

public class HengerProgram {

    private Henger[] hengerek;


    public HengerProgram() {
    }

    public static void main(String[] args) {
        HengerProgram hengerP = new HengerProgram();
        hengerP.run();
    }

    private void run() {
        System.out.println("A programben lévő Hengerek: ");
        lista();
        for (Henger h : hengerek) {
            System.out.println(h);
        }

        int db = Henger.getHengerDarab();
        double atlagV = atlagTerfogat();
        double csovekSulya = csovekSulya();
        System.out.println("A hengerek száma: "+ db);
        System.out.println("Átlag térfogatuk: "+ atlagV);
        System.out.println("A csövek súlya: "+ csovekSulya);
    }

    public double atlagTerfogat() {
        double osszT = 0;
        for (Henger h : hengerek) {
            osszT += h.terfogat();
        }
        return osszT / Henger.getHengerDarab();
    }

    public double csovekSulya() {
        double osszSuly = 0;
        for (Henger h : hengerek) {
            if (h instanceof Cso) {
                osszSuly += ((Cso) h).suly();
            }
        }
        return osszSuly;
    }

    private void lista() {
        hengerek = new Henger[4];
        hengerek[0] = new Henger(3, 4);
        hengerek[1] = new TomorHenger(4, 7);
        hengerek[2] = new Cso(5, 3, 5);
        hengerek[3] = new Cso(6, 4, 2);

    }

}
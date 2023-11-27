package main;

import model.Henger;
import model.TomorHenger;
import model.Cso;
import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<Henger> hengerek;
    
   public static void main(String[] args) {
        HengerProgram program = new HengerProgram();
        program.run();
    }


    public HengerProgram() {
        this.hengerek = new ArrayList<>();
        hengerek.add(new TomorHenger(3.0, 5.0, 2.5));
        hengerek.add(new TomorHenger(1.5, 3.0));  
        hengerek.add(new Cso(3.0, 6.0, 2.0, 0.5));
    }

    public double atlagTerfogat() {
        double osszTerfogat = 0;
        for (Henger henger : hengerek) {
            osszTerfogat += henger.terfogat();
        }
        return hengerek.size() > 0 ? osszTerfogat / hengerek.size() : 0;
    }

    public double csovekSulya() {
        double osszSuly = 0;
        for (Henger henger : hengerek) {
            if (henger instanceof Cso) {
                osszSuly += ((Cso) henger).suly();
            }
        }
        return osszSuly;
    }

    public void run() {
        // Itt lehet tesztelni a példányokat
        System.out.println("Átlagtérfogat: " + atlagTerfogat());
        System.out.println("Csövek összsúlya: " + csovekSulya());
        System.out.println("Hengerek száma: " + Henger.getHengerDarab());

        for (Henger henger : hengerek) {
            System.out.println(henger);
        }
    }

    
}
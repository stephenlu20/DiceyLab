package com.zipcodewilmington;

public class Simulation {
    int dice;
    Bins results;
    int tosses;

    public Simulation(int dice, int tosses) {
        this.dice = dice;
        this.tosses = tosses;
    }

    public void runSimulation() {
        Dice dice = new Dice(this.dice);
        this.results = new Bins(this.dice, this.dice*6);
        
        for (int i = 0; i < this.tosses; i++) {
            int toss = dice.tossAndSum();
            this.results.incrementBin(toss);
        }
    }

    public void printResults() {
        System.out.println("***");
        System.out.println("Simlation of " + String.valueOf(this.dice) + " dice tossed for " + String.valueOf(this.tosses) + " times");
        System.out.println("***\n");
        for (int i = this.dice; i < this.results.bins.length; i++) {
            double percentage = (this.results.bins[i] / (double) this.tosses);
            String row = getRow((int) (percentage*100));
            String result = String.format("%2d : %9d: %.2f ", i, this.results.bins[i], percentage) + row;
            System.out.println(result);
            // System.out.println(String.valueOf(i) + ": " + String.valueOf(this.results.bins[i]));
        }
    }

    public static String getRow(int numberOfStars) {
        String row = "";
        for (int i = 0; i < numberOfStars; i++) {
            row += "*";
        }
        return row;
    }

}

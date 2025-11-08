package com.zipcodewilmington;

public class Simulation {
    Dice dice;
    Bins results;
    int tosses;

    public Simulation(int dice, int tosses) {
        this.dice = new Dice(dice);;
        this.tosses = tosses;
        this.results = new Bins(dice, dice*6);
    }

    public void runSimulation() {

        for (int i = 0; i < this.tosses; i++) {
            int toss = dice.tossAndSum();
            this.results.incrementBin(toss);
        }
    }

    public void printResults() {
        System.out.println("***");
        System.out.println("Simlation of " + String.valueOf(this.dice) + " dice tossed for " + String.valueOf(this.tosses) + " times");
        System.out.println("***\n");
        for (int i = this.dice.dice.length; i < this.results.bins.length; i++) {
            double percentage = (this.results.bins[i] / (double) this.tosses);
            String row = getRow((int) (percentage*100));
            String result = String.format("%3d : %9d: %.2f ", i, this.results.bins[i], percentage) + row;
            System.out.println(result);
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

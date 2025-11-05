package com.zipcodewilmington;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
    }
}

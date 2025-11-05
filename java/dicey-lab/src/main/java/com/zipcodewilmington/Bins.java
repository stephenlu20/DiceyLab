package com.zipcodewilmington;

public class Bins {

    int[] bins;

    public Bins(int lowerBound, int upperBound) {
        this.bins = new int[upperBound+1];
        for (int i = lowerBound; i <= upperBound; i++) {
            bins[i] = 0;
        }
    }

    public void incrementBin(int bin) {
        this.bins[bin]++;
    }

}

package com.zipcodewilmington;

import java.util.Random;

public class Dice {

    int[] dice;

    public Dice(int numberOfDice) {
        this.dice = new int[numberOfDice];
    }

    public int tossAndSum() {
        Random rand = new Random();
        int sum = 0;
        for (int i = 0; i < this.dice.length; i++) {
            this.dice[i] = rand.nextInt(6) + 1;
            sum += this.dice[i];
        }
        return sum;
    }

}

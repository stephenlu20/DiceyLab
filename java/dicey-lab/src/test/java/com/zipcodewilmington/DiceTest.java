package com.zipcodewilmington;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest {

    @Test
    public final void testTossAndSum() {
        int num = 0;
        int[] counts = new int[7];
        for (int i = 0; i < 6; i++) {
            counts[i] = 0;
        }
        for (int i = 0; i < 10000; i++) {
            Dice dice = new Dice(1);
            num = dice.tossAndSum();

            if (num != 0) counts[num] = num;
            if (num == 0) continue;
            assertTrue("Die rolled " + num + "not 1 through 6",
                       num >= 1 && num <= 6);
        }
        for (int j = 1; j < 6; j++) {
            assertTrue("Dice never rolled " + j, counts[j] > 0);
        }
    }

}

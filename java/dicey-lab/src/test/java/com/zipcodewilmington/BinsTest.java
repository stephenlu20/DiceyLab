package com.zipcodewilmington;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinsTest {
    
    @Test
    public final void testIncrementBin() {
        Bins bins = new Bins(2, 12);
        for (int i = 1; i <= 12; i++) {
            bins.incrementBin(i);
        }
        for (int j = 1; j <= 12; j++) {
            assertTrue("Dice never rolled " + j, bins.bins[j] > 0);
        }
    }
    
}

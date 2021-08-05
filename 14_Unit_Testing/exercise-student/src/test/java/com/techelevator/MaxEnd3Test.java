package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {
    private MaxEnd3 MaxEnd3;

    @Before
    public void setup(){
        MaxEnd3 = new MaxEnd3();

    }
    @Test
    public void largerNumber() {
        Assert.assertArrayEquals(new int[] {3,  3, 3},MaxEnd3.makeArray(new int[] {1, 2, 3}));
        Assert.assertArrayEquals(new int[] {11,  11, 11}, MaxEnd3.makeArray(new int[] {11, 5, 9}));
        Assert.assertArrayEquals(new int[] {3,  3, 3}, MaxEnd3.makeArray(new int[] {2, 11, 3}));

    }



}

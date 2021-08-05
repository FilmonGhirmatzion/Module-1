package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lucky13Test {
    
    private Lucky13 Lucky13;
    
    @Before
    public void setup(){
        Lucky13 = new Lucky13();
    }


    @Test
    public void testNotNull() {
        Assert.assertNotNull(Lucky13);
    }
    @Test
    public void test_no_1Or3() {
        Assert.assertEquals(false, Lucky13.getLucky(new int[] {3, 5, 6}));
        Assert.assertEquals(false, Lucky13.getLucky(new int[] {1, 7, 9}));
    }

    @Test
    public void test_Anything_but_1Or3() {
        Assert.assertEquals(true, Lucky13.getLucky(new int[] {2, 4, 6}));
        Assert.assertEquals(true, Lucky13.getLucky(new int[] {5, 6, 7}));
    }
}

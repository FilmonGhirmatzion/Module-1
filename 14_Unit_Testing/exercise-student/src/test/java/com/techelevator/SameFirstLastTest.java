package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {
    private SameFirstLast SameFirstLast;


    @Before
    public void setup(){
        SameFirstLast = new SameFirstLast();
    }
    @Test
    public void notnull() {
        Assert.assertNotNull(SameFirstLast);
    }
    @Test
    public void testTrue(){
        Assert.assertEquals(true, SameFirstLast.isItTheSame(new int[] {1, 2, 1}));
        Assert.assertEquals(true, SameFirstLast.isItTheSame(new int[] {1, 2, 3, 1}));

    }
    @Test
    public void testFalse() {

        Assert.assertEquals(false, SameFirstLast.isItTheSame(new int[] {1, 2, 3}));
        Assert.assertEquals(false, SameFirstLast.isItTheSame(new int[] {2, 4, 6, 1}));


    }


}

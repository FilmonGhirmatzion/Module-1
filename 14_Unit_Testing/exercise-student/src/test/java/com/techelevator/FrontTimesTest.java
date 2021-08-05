package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {

    private FrontTimes FrontTimes;

    @Before

    public void setup(){
        FrontTimes =new FrontTimes();
    }
    @Test
    public void notNull() {
        Assert.assertNotNull(FrontTimes);
    }
    @Test
    public void testFrontString_ntimes() {
        Assert.assertEquals("ChoChoCho", FrontTimes.generateString("Chocolate", 3));
        Assert.assertEquals("FilFil", FrontTimes.generateString("Filmon", 2));
    }
    @Test
    public void testLessThan3Char() {
        Assert.assertEquals("AbAbAbAb",FrontTimes.generateString("Ab", 4));	}



}

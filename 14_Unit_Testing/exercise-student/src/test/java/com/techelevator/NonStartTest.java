package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {
    private NonStart NonStart;



    @Before
    public void setup(){
        NonStart = new NonStart();


    }
    @Test
    public void OmitFirstChar() {
        Assert.assertEquals("ellohere", NonStart.getPartialString("Hello", "There"));
        Assert.assertEquals("avaode", NonStart.getPartialString("java", "code"));
        Assert.assertEquals("hotlava", NonStart.getPartialString("shotl", "java"));

    }


}

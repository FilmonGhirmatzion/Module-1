package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {

    private Less20 Less20;

    @Before

    public void setup(){
        Less20 = new Less20();
    }



    @Test
    public void testOneLessThanMultipleOf_20() {

        Assert.assertEquals(true, Less20.isLessThanMultipleOf20(39));
        Assert.assertEquals(true, Less20.isLessThanMultipleOf20(79));

    }

    @Test
    public void testTwoLessThanMultipleOf_20() {
        Assert.assertEquals(true, Less20.isLessThanMultipleOf20(38));
        Assert.assertEquals(true, Less20.isLessThanMultipleOf20(98));


    }
}

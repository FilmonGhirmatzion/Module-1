package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {

    private DateFashion dateFashion;

    @Before
    public void setup(){
        dateFashion = new DateFashion();
    }

    @Test
    public void restaurant_table() {
        Assert.assertEquals(DateFashion.getATable(5,10),2);



    }
}
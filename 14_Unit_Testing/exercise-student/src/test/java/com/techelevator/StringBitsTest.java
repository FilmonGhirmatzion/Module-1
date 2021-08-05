package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {
    private StringBits StringBits;

    @Before
    public void setup() {
        StringBits = new StringBits();
    }
        @Test
        public void every_other_chart() {
            Assert.assertEquals("Hlo", StringBits.getBits("Hello"));
            Assert.assertEquals("Flo", StringBits.getBits("Filmon"));
            Assert.assertEquals("H", StringBits.getBits("Hi"));

        }

    }


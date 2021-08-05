package com.techelevator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {

    private AnimalGroupName AnimalGroupName;



    @Before
    public void setup() {
        AnimalGroupName = new AnimalGroupName ();
    }

    @Test
    public void animal_group_Rhino() {


        Assert.assertEquals("Crash" , AnimalGroupName.getHerd("Rhino"));
        Assert.assertEquals("Crash" , AnimalGroupName.getHerd("rhino"));
        Assert.assertEquals("Crash" , AnimalGroupName.getHerd("RHINO"));
    }

    @Test
    public void animal_group_Dog() {

        Assert.assertEquals("Pack",AnimalGroupName.getHerd("Dog"));
        Assert.assertEquals("Pack",AnimalGroupName.getHerd("dog"));
        Assert.assertEquals("Pack",AnimalGroupName.getHerd("DOG"));

    }




    @Test
    public void test_Null_Or_Unkown() {

        Assert.assertEquals("unknown" , AnimalGroupName.getHerd("monkey"));





    }


}
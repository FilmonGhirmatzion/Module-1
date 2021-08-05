package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {

    private CigarParty CigarParty;


        @Before
             public void setup() {
            CigarParty = new CigarParty();


        }
      /*

       test
     haveParty(30, false) → false
     haveParty(50, false) → true
     haveParty(70, true) → true
           */
            @Test

            public void Cigar_party_Squirrels(){
                Assert.assertFalse (CigarParty.haveParty(30,false));
                Assert.assertTrue (CigarParty.haveParty(50,false));
                Assert.assertTrue (CigarParty.haveParty(70,true));


            }



}

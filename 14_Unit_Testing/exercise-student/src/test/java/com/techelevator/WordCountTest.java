package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {
    private WordCount wordCount;

    @Before
    public void setUp() {

        wordCount = new WordCount();

    }

    /*
    test condition                            result
    ["ba", "ba", "black", "sheep"]          {"ba" 2, "black" 1, "sheep" 1 }
    ["a", "b", "a", "c", "b"]               {"a" 2, "b" 2, "c" 1}
    ["c", "b", "a"]                         {"c" 1, "b" 1, "a" 1}
    []
    ["a", "a", "a", "b"]                            {b 1, a 3}
     */
    @Test
    public void if_key_has_two_same_return_value_2() {
        String[] testArray = {"ba", "ba", "black", "sheep"};

        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("ba", 2);
        expectedResult.put("black", 1);
        expectedResult.put("sheep", 1);

        Map<String, Integer> actualResult = wordCount.getCount(testArray);

        Assert.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void if_key_has_two_same_return_value_Two() {
        String[] testArray = {"a", "b", "a", "c", "b"};

        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("a", 2);
        expectedResult.put("b", 2);
        expectedResult.put("a", 2);
        expectedResult.put("c", 1);

        Map<String, Integer> actualResult = wordCount.getCount(testArray);

        Assert.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void if_key_has_three_same_return_value_Three() {
        String[] testArray = {"c", "b", "a"};

        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("c", 1);
        expectedResult.put("b", 1);
        expectedResult.put("a", 1);


        Map<String, Integer> actualResult = wordCount.getCount(testArray);

        Assert.assertEquals(expectedResult, actualResult);


    }
}

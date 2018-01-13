package com.kodilla.testing.collection;
import java.util.*;

import com.kodillla.testing.collection.ListCreator;
import com.kodillla.testing.collection.OddNumbersExterminator;
import org.junit.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(10);
        newList.add(11);
        newList.add(12);
        newList.add(13);
        newList.add(14);
        newList.add(15);

        OddNumbersExterminator newEvenList = new OddNumbersExterminator();
        ArrayList<Integer> theEvenList = newEvenList.exterminate(newList);
        System.out.println("Fetched ArrayList. Continue testing...");
        if(theEvenList.isEmpty()){
        Assert.assertTrue(theEvenList.isEmpty());
        System.out.println("Tested ArrayList is empty.");}
        else{
            Assert.assertFalse(theEvenList.isEmpty());
            System.out.println("Tested ArrayList is not empty.");}


    }

    @Test
     public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(10);
        newList.add(11);
        newList.add(12);
        newList.add(13);
        newList.add(14);
        newList.add(15);

        ArrayList<Integer> checkList = new ArrayList<Integer>();
        checkList.add(10);
        checkList.add(12);
        checkList.add(14);

        OddNumbersExterminator newEvenList = new OddNumbersExterminator();
        ArrayList<Integer> theEvenList = newEvenList.exterminate(newList);
        System.out.println("Checking list items...");
        Assert.assertEquals(checkList,theEvenList);

        }
}

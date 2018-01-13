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
        ListCreator newList = new ListCreator();
        Integer size = 22;
        Integer intNumbers = 44;
        newList.CreateArrayList(size, intNumbers);

        OddNumbersExterminator newEvenList = new OddNumbersExterminator();
        ArrayList<Integer> theList = newList.getList();
        ArrayList<Integer> theEvenList = newEvenList.exterminate(theList);

        if (theEvenList.size() == 0) {
            System.out.println("ArrayList is empty!");
        } else {
            System.out.println("Fetched ArrayList. Continue with testing...");
        }
    }

    @Test
     public void testOddNumbersExterminatorNormalList(){
        Integer checkItem = null;
        ListCreator newList = new ListCreator();
        Integer size = 10;
        Integer intNumbers = 10;
        newList.CreateArrayList(size, intNumbers);

        OddNumbersExterminator newEvenList = new OddNumbersExterminator();
        ArrayList<Integer> theList = newList.getList();
        ArrayList<Integer> theEvenList = newEvenList.exterminate(theList);
        //theEvenList.add(13);
        for(Integer item: theEvenList) {
            checkItem = item % 2;
            checkItem = checkItem + checkItem;
            //System.out.println(item + " " + checkItem);
        }
           if(checkItem==0){
                System.out.println("Congratulations. Your ArrayList contains only even numbers!");}
                else{
                System.out.println("Error. Your ArrayList contains odd numbers!");
            }

        }
}

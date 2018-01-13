package com.kodillla.testing.collection;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        ListCreator newList = new ListCreator();
        Integer size=10;
        Integer intNumbers = 10;
        newList.CreateArrayList(size,intNumbers);

        OddNumbersExterminator newEvenList = new OddNumbersExterminator();
        ArrayList<Integer> theList = newList.getList();
        ArrayList<Integer> theEvenList = newEvenList.exterminate(theList);
    }
}

package com.kodillla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            Integer item = numbers.get(i);
            Integer itemZero = item % 2;
            if (itemZero ==0){
                evenList.add(item);
            }
        }
        if(evenList.isEmpty()){
           // evenList = null;
            System.out.println("Your ArrayList is empty!");

        }

        return evenList;
    }

}

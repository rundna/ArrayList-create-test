package com.kodillla.testing.collection;

import java.util.*;

public class ListCreator {
    ArrayList<Integer> List;

    public ArrayList<Integer> CreateArrayList(Integer size, Integer intNumbers){

        ArrayList<Integer> List = new ArrayList<Integer>();
        intNumbers--;
        for (int i=0;i<size;i++){
            intNumbers++;
            List.add(intNumbers);
           // System.out.println(List.get(i));
        }
        return this.List = List;
    }
    public ArrayList<Integer> getList(){
        return this.List=List;
    }
}

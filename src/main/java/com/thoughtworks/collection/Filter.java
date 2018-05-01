package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> arrayList = new ArrayList();

        for(int element:this.array)
        {
            if(element%2==0)
               arrayList.add(element);
        }

       this.array=arrayList;
        return this.array;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> arrayList = new ArrayList();

        for(int element:this.array)
        {
            if(element%3==0)
                arrayList.add(element);
        }

        this.array=arrayList;
        return this.array;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> arrayList = new ArrayList();

        for(int firstListElement:firstList)
        {
            for(int secondListElement:secondList)
            {
                if(firstListElement == secondListElement)
                {
                    arrayList.add(firstListElement);
                    break;
                }
            }
        }

       return arrayList;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> arrayList = new ArrayList();

        for(int element:this.array)
        {
            if(arrayList.contains(element))
                continue;
            else
                arrayList.add(element);
        }
        this.array=arrayList;
        return this.array;
    }

}
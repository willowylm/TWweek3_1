package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {

    }

    public InverseReduce(Random random) {

        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> result = new ArrayList();
        int element=number-2;

        while(element-2>0)
            {
            element=number-2;
            result.add(element);
            number=element;
        }

            return  result;
    }

   
}

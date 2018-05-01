package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array)
    {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result = new ArrayList();

        for(int i=0;i<this.array.length;i++)
        {
            for(int j=0;j<this.array[i].length;j++)
                result.add(this.array[i][j]);
        }

        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result = new ArrayList();
        List<Integer> arrayList = new ArrayList();

        for(int i=0;i<this.array.length;i++)
        {
            for(int j=0;j<this.array[i].length;j++)
                arrayList.add(this.array[i][j]);
        }

        for(int element:arrayList)
        {
            if(result.contains(element))
                continue;
            else
                result.add(element);
        }
        return result;
    }

   
}

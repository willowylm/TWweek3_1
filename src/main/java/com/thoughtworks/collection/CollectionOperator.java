package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import sun.security.util.Length;

import java.util.*;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List result = new LinkedList();
        if (left<right)
        {
            for(int i=left;i<=right;i++)
                result.add(i);
        }
        else
        {
            for(int i=right;i<=left;i++)
                result.add(i);
            Collections.reverse(result);
        }

        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List result = new LinkedList();

        if (left<right)
        {
            for(int i=left;i<=right;i++)
            {
                if(i%2==0)
                    result.add(i);
            }
        }
        else
        {
            for(int i=right;i<=left;i++)
            {
                if(i%2==0)
                    result.add(i);
            }
            Collections.reverse(result);
        }

        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List result = new LinkedList();

        for (int i:array) {
            if (i % 2 == 0)
                result.add(i);
        }
        return result;
    }

    public int popLastElment(int[] array) {
        int result=array[array.length-1];

        return result;
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> resultList = new ArrayList<Integer>();
        for(int firstArrrayElement:firstArray)
        {
            for(int secondArrayElement:secondArray)
            {
                if(firstArrrayElement == secondArrayElement)
                {
                    resultList.add(firstArrrayElement);
                    break;
                }
            }
        }

        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> resultList = new ArrayList<Integer>(Arrays.asList(firstArray));

        int flag=1;
        for(int secondArrayElement:secondArray)
        {
            for(int firstArrrayElement:firstArray)
            {
                if(firstArrrayElement == secondArrayElement)
                {
                    flag=0;
                    break;
                }
                else
                {
                    flag=1;
                }
            }
            if(flag==1)
                resultList.add(secondArrayElement);
        }


        return resultList;
    }

}

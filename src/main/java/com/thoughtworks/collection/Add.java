package com.thoughtworks.collection;
//package Add;

import com.sun.glass.ui.Size;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import sun.security.util.Length;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum=0;

        if(leftBorder<rightBorder) {
            for (int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 == 0)
                    sum += i;
                else
                    sum += 0;
            }
        }
        else
        {
            for (int i = rightBorder; i <= leftBorder; i++) {
                if (i % 2 == 0)
                    sum += i;
                else
                    sum += 0;
            }
        }

        return sum;
        //throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;

       if (leftBorder<rightBorder) {
            for (int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 != 0)
                    sum += i;
                else
                    sum += 0;
            }
        }
        else
        {
            for (int i = rightBorder; i <= leftBorder; i++) {
                if (i % 2 != 0)
                    sum += i;
                else
                    sum += 0;
            }
        }

        return sum;
        //throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum=0;
        for (int i:arrayList)
        {
            i=i*3+2;
            sum+=i;
        }
        return sum;
        //throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();

        for(int i:arrayList)
        {
            if(i%2!=0)
            {
                i=i*3+2;
                result.add(i);
            }
            else
            {
                result.add(i);
            }
        }
        return result;
        //throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum=0;

        for (int i:arrayList)
        {
            if(i%2!=0)
            {
                i=i*3+5;
                sum+=i;
            }
            else
                sum+=0;
        }

        return sum;
       // throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        int len= arrayList.size() -1;

        for (int i=0;i<len;i++)
        {
            int j=(arrayList.get(i) + arrayList.get(i + 1)) * 3;
            result.add(j);
        }

        return result;

       // throw new NotImplementedException();
    }
    public double getMedianOfEvenIndex(List<Integer> arrayList) {
       int len = arrayList.size();
       int result=0;

       if (len%2!=0)
           result=arrayList.get(len / 2);
       else
           result=(arrayList.get(len / 2) + arrayList.get(len / 2 - 1))/2;

          return result;
        //throw new NotImplementedException();
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int sum=0;
        int count=0;
        int result;

        for(int i:arrayList)
        {
            if (i%2==0)
            {
                sum+=i;
                count++;
            }
        }

        result=sum/count;
        return result;
        //throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> evenList = new ArrayList<>();
        int tag =0;

        for (int i:arrayList)
        {
            if(i%2==0)
                evenList.add(i);
        }

        for (int i:evenList)
        {
            if (i==specialElment)
            {
                tag=1;
                break;
            }
        }

        if(tag==1)
          return true;
        else
          return false;
       // throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int flag=0;

        for (int i:arrayList)
        {
            if (i%2==0)
                evenList.add(i);
        }

        result.add(2);
        for (int i=0;i<evenList.size();i++)
        {
            for (int j=0;j<i;j++)
            {
                    if (evenList.get(i) != evenList.get(j))
                        flag = 1;
                    else {
                        flag = 0;
                        break;
                    }
            }
            if(flag==1){
                result.add(evenList.get(i));
            }
        }

        return  result;
       // throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List evenList = arrayList.stream().filter(item -> item % 2 == 0).sorted().collect(Collectors.toList());
        List oddList = arrayList.stream().filter(item -> item % 2 != 0).sorted().collect(Collectors.toList());
        Collections.reverse(oddList);
        evenList.addAll(oddList);
        return evenList;

       // throw new NotImplementedException();
   }

}

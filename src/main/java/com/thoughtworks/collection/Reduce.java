package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int max=0;

        for(int element:this.arrayList)
        {
            if(element>max)
                max=element;
            else
                continue;
        }

        return max;
    }

    public double getMinimum() {
        int min=this.arrayList.get(0);

        for(int element:this.arrayList)
        {
            if(element<min)
                min=element;
            else
                continue;
        }

        return min;
    }

    public double getAverage() {
     int sum=0;
     float count=0;
     float result=0;

        for(int element:this.arrayList)
        {
            sum+=element;
            count++;
        }
       result=sum/count;

        return result;
    }

    public double getOrderedMedian() {
        Integer[] array=new Integer[]{};
        array= (Integer[]) this.arrayList.toArray();
        double result=0;

        Arrays.sort(array);
        List<Integer> arrayResult=Arrays.asList(array);
        if(arrayResult.size()%2!=0)
            result=arrayResult.get(arrayResult.size()/2);
        else
            result=(double)(arrayResult.get(arrayResult.size()/2)+arrayResult.get(arrayResult.size()/2-1))/2.0;

        return result;

    }

    public int getFirstEven() {
       int result=0;

        for(int element:this.arrayList)
        {
            if (element%2==0) {
                result = element;
                break;
            }
            else
                continue;
        }

         return result;
    }

    public int getIndexOfFirstEven() {
        int resultIndex=0;

        for(int element:this.arrayList)
        {
            if (element%2==0) {
                resultIndex = this.arrayList.indexOf(element);
                break;
            }
            else
                continue;
        }

        return resultIndex;
    }

    public boolean isEqual(List<Integer> arrayList) {
        return this.arrayList.equals(arrayList);
    }

    
    public Double getMedianInLinkList(SingleLink singleLink) {
        for (int i = 0; i < arrayList.size(); i++) {
            singleLink.addTailPointer(arrayList.get(i));
        }
        int index = arrayList.size() / 2;
        double result=0;

        if(arrayList.size()%2==0) {
            double firstMid = Double.parseDouble(singleLink.getNode(index).toString());
            double secondMid = Double.parseDouble(singleLink.getNode(index + 1).toString());
            result = (firstMid+secondMid)/2.0 ;
        }
        else
        {
            result=Double.parseDouble(singleLink.getNode(index+1).toString());
        }
        return result;
    }

    public int getLastOdd() {
     int result=0;

     for(int i=this.arrayList.size()-1;i>=0;i--)
     {
         if(this.arrayList.get(i)%2!=0) {
             result = this.arrayList.get(i);
             break;
         }
         else
             continue;
     }

     return result;
    }

    public int getIndexOfLastOdd() {
        int result=0;

        for(int i=this.arrayList.size()-1;i>=0;i--)
        {
            if(this.arrayList.get(i)%2!=0) {
                result = i;
                break;
            }
            else
                continue;
        }

        return result;
    }

}

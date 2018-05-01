package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {

        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> arrayList = new ArrayList();

        for(int element:this.array)
        {
                arrayList.add(element*3);
        }

        this.array=arrayList;
        return this.array;
    }

    public List<String> mapLetter() {
        List<String> arrayList = new ArrayList();

        for(int index:this.array)
        {
            arrayList.add(this.letterList.get(index-1));
        }

        return arrayList;
    }

    public List<String> mapLetters() {
        List<String> arrayList = new ArrayList();

        for(int index:this.array)
        {
            if(index>=26) {
                int firstind = index / 26;
                int secondind = index % 26;
                 if (secondind == 0) {
                    arrayList.add(letterList.get(firstind - 2) + "z");
                } else {
                    arrayList.add(letterList.get(firstind - 1) + letterList.get(secondind - 1));
                }
            }
            else
            {
                arrayList.add(this.letterList.get(index - 1));
            }
        }

        return arrayList;
    }

    public List<Integer> sortFromBig() {
        Integer[] arrayResult=new Integer[]{};
        arrayResult= (Integer[]) this.array.toArray();

        Arrays.sort(arrayResult);
        List<Integer> result=Arrays.asList(arrayResult);
        Collections.reverse(result);

        return result;
    }

    public List<Integer> sortFromSmall() {
        Integer[] arrayResult=new Integer[]{};
        arrayResult= (Integer[]) this.array.toArray();

        Arrays.sort(arrayResult);
        List<Integer> result=Arrays.asList(arrayResult);

        return result;
    }

}

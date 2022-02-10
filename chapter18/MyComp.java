package com.java.zuevmihailbelg.javacore.chapter18;

import java.util.*;

public class MyComp implements Comparator<String> {
    public int compare(String a,String b){
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return bStr.compareTo(aStr);
    }

}

class CompDemo{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("С");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for(String element : ts){
            System.out.println(element + " ");
        }
        System.out.println();
    }
}

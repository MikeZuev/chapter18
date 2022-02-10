package com.java.zuevmihailbelg.javacore.chapter18;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int array[] = new int[]{3,4,5,6,6,8};
        Task2 task = new Task2();

        task.countSameNums(array);

        System.out.println();
    }
    public  void countSameNums(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 1;

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();


        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.replace(arr[i], sum + 1);

           }
            else
                map.put(arr[i], sum);

        }
        for(Map.Entry<Integer, Integer> me : set){
            if(me.getValue() >= 2){
                System.out.println("Число " + me.getKey() + " повточряется "+me.getValue());
            }
        }
        System.out.println(map);

        }








        }




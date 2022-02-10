package com.java.zuevmihailbelg.javacore.chapter18;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int array[] = new int[]{3, 8, 15, 17};

        Task1 task = new Task1();

        task.getResultByIndexes(array, 32);


    }

    public void getResultByIndexes(int arr[], int a) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);

        }


        for (Map.Entry<Integer, Integer> me : map.entrySet()) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 1; j< arr.length; j++) {
                    if (map.getOrDefault(i, me.getValue()) + map.getOrDefault(j, me.getValue()) == a) {
                        System.out.println(map.get(i) +" "+ map.get(j));

                        break;


                    }else
                        continue;



                }

            }


        }
    }
}

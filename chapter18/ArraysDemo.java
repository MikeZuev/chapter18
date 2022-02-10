package com.java.zuevmihailbelg.javacore.chapter18;
import java.util.*;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];
        for(int i = 0; i < 10; i++)
            array[i] = -3 * i;

        System.out.println("исходный массив: ");
        //display(array);
        Arrays.sort(array);
        System.out.print("Отсортированный массив; ");
        //display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.println("Массив после вызова метода fill(): ");
        //display.array();

        Arrays.sort(array);
        System.out.println("Массив после повторной сортировки: ");
        //display.array();

        System.out.println("Значениме -9 находится на позиции ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);


        }
        static void dispay(int array[]){
        for(int i : array)
            System.out.print(i + " ");
            System.out.println();
        }

    }


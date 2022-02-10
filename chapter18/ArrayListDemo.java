package com.java.zuevmihailbelg.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Начальный размер списочного массива al: " + al.size());


        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "А2");
        System.out.println("" +
                "Размер списочного массива al после ввода элементов: " + al.size());
        // вывести списочный массв

        System.out.println("Содержимое списочного массива al: " + al);

        //удалить элементы из списочного массива

        al.remove("F");
        al.remove(2);

        System.out.println("" +
                "Размер списочного массива al поле удаления элементовЖ " + al.size());

        System.out.println("Содержимое списочного массива al: " + al);
    }



}




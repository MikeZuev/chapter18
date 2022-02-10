package com.java.zuevmihailbelg.javacore.chapter18;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // создать хэш-множество
        HashSet<String> hs = new HashSet<>();

        //ввести элементы в хэш-множество

        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}




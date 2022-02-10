package com.java.zuevmihailbelg.javacore.chapter18;
import java.util.*;

public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<String, Double>();

        String str;
        double bal;

        balance.put("Джон Доу", 3434.34);
        balance.put("Том Смит", 123.22);
        balance.put("Тод Холл", 1378.00);
        balance.put("Ральф Смит", -19.08);

        Set<String> set = balance.keySet();

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()){
            str = itr.next();
            System.out.println(str + " : " + balance.get(str));
        }

        System.out.println();

        bal = balance.get("Джон Доу");

        balance.put("Джон Доу", bal + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + balance.get("Джон Доу"));
    }
}

package com.java.zuevmihailbelg.javacore.chapter18;
import java.util.*;

public class PropDemoDef {


    public static void main(String[] args) {
        Properties defList = new Properties();

        defList.put("Флорида", "Тэлесси");
        defList.put("Висконсин", "Мэдисон");
        Properties capitals = new Properties();
        capitals.put("Иллинойс","Спрингфилд");
        capitals.put("Миссури","Джефферсон-сити");
        capitals.put("Вашингтон","Олимпия");
        capitals.put("Калифорния","Сакраменто");
        capitals.put("Индиана","Индианаполис");

        Set<?> states = capitals.keySet();



    }
}

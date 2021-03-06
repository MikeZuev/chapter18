package com.java.zuevmihailbelg.javacore.chapter18;
import java.io.*;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try{
            fin = new FileInputStream("phonebook.dat");
        }catch(FileNotFoundException e){

        }
        try{
            if(fin != null){
                ht.load(fin);
                fin.close();
            }
        }catch(IOException e){
        System.out.println("Ошибка чтения файла.");
     }
        do{
            System.out.println("Введите имя" +
                    " ('вывод' для завершения): ");
            name = br.readLine();
            if(name.equals("вывод"))continue;
            System.out.println("Введите номер: ");
            if(changed){
                FileOutputStream fout = new FileOutputStream("phonebook.dat");
                ht.store(fout, "телефонная книга");
                fout.close();
            }
        }while(!name.equals("выход"));
        do{
            System.out.println("Введите имя для поиска" +
                    "('выход' для завершения): ");
            name = br.readLine();
            if(name.equals("выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);

        }while(!name.equals("выход"));

}
    }

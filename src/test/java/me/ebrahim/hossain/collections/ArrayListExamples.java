package me.ebrahim.hossain.collections;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        System.out.println(list);
        System.out.println(list.size());

        list.add("Rupa");
        list.add("Nazmul");
        list.add("Mahir");
        list.add("Rokaiya");
        list.add("Rifat");

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        for(String li : list){
            System.out.println(li);
        }

        System.out.println(list);
        System.out.println("Index-3: "+list.get(3));
        System.out.println(list.size());

        list.remove("Nazmul");
        System.out.println(list);

        list.clear();
        System.out.println(list);





    }
}

package main.java.lesson3.objects;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A_Set {
//SET нет дубляжей
    public static void main(String[] args) {
       Set <String> setStr = new HashSet<>();
       setStr.add("AAA");
       setStr.add("BBB");
       setStr.add("CCC");
       setStr.add("DDD");
       setStr.remove("DDD");


       System.out.println(setStr.size());

        for (String str: setStr) {
            System.out.println(str); //закидывается в str setStr
        }


        Integer ii = 1000;
        Set<Integer> intSet = new HashSet<>();


        Set<Cat> catSet = new HashSet<>();
        catSet.add(new Cat("nsds"));

//        Iterator it = setStr.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }


    }
}

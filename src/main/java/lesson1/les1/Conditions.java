package lesson1.les1;

import java.sql.SQLOutput;

public class Conditions {
    public static void main(String[] args) {
        int age = 10;
        //boolean isyoung = age <= 18;
        if (age <= 18) {
            System.out.println("Acces denied. You are too young!!!");
        } else if(age > 18 && age < 70) {
            System.out.println("Hello ");
        } else {
            System.out.println("Acces denied. You are too old");
        }


        //--------------LOGIC

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(false || false);



    }
}

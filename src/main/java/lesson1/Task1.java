package lesson1;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */
    public static void main(String[] args) {
        int minimunA_B = minA_B(4,3);
        int minimunA_B_C = minA_B_C(minimunA_B, 3);
        System.out.println(minimunA_B_C);

    }

     static int minA_B(int a, int b) {
         return Math.min(a,b);
    }

    static int minA_B_C(int minA_B, int c) {
        return Math.min(minA_B,c);
    }





    }

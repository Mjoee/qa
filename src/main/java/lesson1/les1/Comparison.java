package lesson1.les1;

import org.w3c.dom.ls.LSOutput;

public class Comparison {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = a;
        int d = 10;

//        System.out.println(a > b);
//        System.out.println(a < b);
//        System.out.println(a >= b);
//        System.out.println(a <= b);
        boolean isEqual = a == b;
        boolean isEqual2 = !(a == b); //разворот булин значения
        boolean bool1 = true;
        boolean bool2 = false;

        b = 10;
        System.out.println(isEqual);
        System.out.println(a != b);
        System.out.println(bool1 == bool2);

    }
}

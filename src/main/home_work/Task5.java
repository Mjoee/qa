package main.java.home_work;

import org.testng.IResultMap;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {
        reverseName();
    }

    public static void reverseName() {
        StringBuffer reversedName = new StringBuffer("Nikita Piatilietov");
        reversedName.reverse();
        System.out.println(reversedName);

    }





}

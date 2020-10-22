package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

import org.w3c.dom.ls.LSOutput;

import java.io.PrintStream;

public class Task3 {

    public static void main(String[] args) {
        String s = "Nikita ";
        int counter = 0;

        while (counter < 5) {
            System.out.println(s + s + s + s + s + s + s + s + s + s);
            counter++;
        }






    }

}


package main.java.home_work;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

import main.java.lesson3.objects.HW1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Task2 {

    public static void main(String[] args) {
        getNames();
    }

    public static String getNames() {
        String result = "";
         String s = "Nikita ";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                result += s;
            }
            result += "\n";
        }
        return result;

    }


}



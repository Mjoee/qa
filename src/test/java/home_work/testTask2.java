package test.java.home_work;

import main.java.lesson3.objects.HW1;
import org.testng.Assert;
import org.testng.annotations.Test;
import main.java.home_work.Task2;

import static main.java.home_work.Task2.getNames;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testTask2 extends Task2 {

    @Test
    public  void testTask2() {

        String actualResult = Task2.getNames();
        System.out.println(actualResult);
        String strArr[] = actualResult.split("\n");
        System.out.println("Lines amount: " + strArr.length);
        for (String el: strArr) {
            String namesArr[] = el.split(" ");
            System.out.println("Names in line amount: " + namesArr.length);
            assertEquals(namesArr.length, 10);
        }
        assertEquals(strArr.length, 5);

    }





}





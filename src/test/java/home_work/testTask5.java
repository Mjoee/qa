package test.java.home_work;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static main.java.home_work.Task5.reverseName;
import static org.testng.AssertJUnit.*;

import main.java.home_work.Task5;


public class testTask5 extends Task5 {

    @Parameters({"name"})
    @Test
    public void testReverse() {

        String name = "Nikita Piatilietov";
        StringBuffer reversedName = new StringBuffer(name);
        reversedName.reverse();
        System.out.println(reversedName);
        assertNotSame(reversedName, name);
        System.out.println(name.length());
        assertTrue(name.length() == 18);
        assertTrue(reversedName.length() == name.length());


    }



}

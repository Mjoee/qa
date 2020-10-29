package test.java.home_work;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testTask1 {


    static int minA_B(int a, int b) {
        return Math.min(a, b);
    }

    static int minA_B_C(int minA_B, int c) {
        return Math.min(minA_B, c);
    }

    @Test(dataProvider = "d")
    public void minAbcTest(int a, int b, int c) {
        int minimunA_B = minA_B(a, b);
        int minimunA_B_C = minA_B_C(minimunA_B, c);
        System.out.println(minimunA_B_C);
        assertEquals(Math.min(minimunA_B, minimunA_B_C), minimunA_B_C, "Error!");
        assertTrue(minimunA_B != minimunA_B_C);

    }


    @DataProvider(name = "d")
    public Object[][] dataProvider() {
    return new Object[][]{

            {3, 2, 1},
            {21, 20, 5},
            {1, 2, 0},
            {19, 20, 1},
            {1, 8, -22},
        };
    }


}





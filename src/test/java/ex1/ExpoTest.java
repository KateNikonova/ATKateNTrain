package ex1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpoTest extends BaseTestClass {

    @Test
    public void substract1Test() {
        System.out.println("Test 1:");
        double actual = calc.expo(12, 2);
        Assert.assertEquals(actual, 144);

    }

    @Test
    public void substract2Test() {
        System.out.println("Test 2:");
        double actual = calc.expo(2, 2);
        Assert.assertEquals(actual, 4);

    }

    @Test
    public void substract3Test() {
        System.out.println("Test 3:");
        double actual = calc.expo(5, 0);
        Assert.assertEquals(actual, 1);

    }


}
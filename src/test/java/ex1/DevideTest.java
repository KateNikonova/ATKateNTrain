package ex1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DevideTest extends BaseTestClass {

    @Test
    public void substract1Test() {
        System.out.println("Test 1:");
        int actual = calc.devide(12, 6);
        Assert.assertEquals(actual, 2);

    }

    @Test
    public void substract2Test() {
        System.out.println("Test 2:");
        int actual = calc.devide(120, 2);
        Assert.assertEquals(actual, 60);

    }

    @Test
    public void substract3Test() {
        System.out.println("Test 3:");
        int actual = calc.devide(5, 5);
        Assert.assertEquals(actual, 1);

    }


}
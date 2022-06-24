package ex1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubstrTest extends BaseTestClass {

    @Test
    public void substract1Test() {
        System.out.println("Test 1:");
        int actual = calc.substract(12, 5);
        Assert.assertEquals(actual, 7);

    }

    @Test
    public void substract2Test() {
        System.out.println("Test 2:");
        int actual = calc.substract(12, 2);
        Assert.assertEquals(actual, 10);

    }

    @Test
    public void substract3Test() {
        System.out.println("Test 3:");
        int actual = calc.substract(5, 5);
        Assert.assertEquals(actual, 0);

    }


}
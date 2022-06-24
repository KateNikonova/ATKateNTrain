package ex1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyTest extends BaseTestClass {

    @Test
    public void substract1Test() {
        System.out.println("Test 1:");
        int actual = calc.multiply(12, 5);
        Assert.assertEquals(actual, 60);

    }

    @Test
    public void substract2Test() {
        System.out.println("Test 2:");
        int actual = calc.multiply(12, 2);
        Assert.assertEquals(actual, 24);

    }

    @Test
    public void substract3Test() {
        System.out.println("Test 3:");
        int actual = calc.multiply(5, 5);
        Assert.assertEquals(actual, 25);

    }


}
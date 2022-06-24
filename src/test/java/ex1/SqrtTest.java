package ex1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTestClass {

    @Test
    public void substract1Test() {
        System.out.println("Test 1:");
        double actual = calc.sqrtcalc(625);
        Assert.assertEquals(actual, 25);

    }

    @Test
    public void substract2Test() {
        System.out.println("Test 2:");
        double actual = calc.sqrtcalc(1);
        Assert.assertEquals(actual, 1);

    }

    @Test
    public void substract3Test() {
        System.out.println("Test 3:");
        double actual = calc.sqrtcalc(4);
        Assert.assertEquals(actual, 2);

    }


}
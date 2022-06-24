package ex1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest extends BaseTestClass{

    @Test
    public void calcTest1() {
        int actual = calc.sum(2, 5);
        Assert.assertEquals(actual, 7);

    }

    @Test
    public void calcTest2() {
        int actual = calc.sum(0, 5);
        Assert.assertEquals(actual, 5);

    }

    @Test
    public void calcTest3() {
        int actual = calc.sum(20, 5);
        Assert.assertEquals(actual, 25);

    }

    @Test
    public void calcTest4() {
        int actual = calc.sum(-2, 50);
        Assert.assertEquals(actual, 48);

    }


}
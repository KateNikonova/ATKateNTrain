import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    @Test
    public void calcTest() {
        FirstCalc calc = new FirstCalc();
        int actual = calc.sum(2, 5);
        Assert.assertEquals(actual, 7);

    }


}
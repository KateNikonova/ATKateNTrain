import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubstrTest {

    private FirstCalc calc;

    @BeforeMethod
    public void setUp(){
        System.out.println("Test before");
        calc = new FirstCalc();
    }

    @Test
    public void substr1Test() {
        System.out.println("Test 1:");
        int actual = calc.substr(12, 5);
        Assert.assertEquals(actual, 7);

    }

    @Test
    public void substr2Test() {
        System.out.println("Test 2:");
        int actual = calc.substr(12, 2);
        Assert.assertEquals(actual, 10);

    }

    @Test
    public void substr3Test() {
        System.out.println("Test 3:");
        int actual = calc.substr(5, 5);
        Assert.assertEquals(actual, 0);

    }

    @AfterMethod
    public void tearDow(){
        System.out.println("Test after");
        calc = null;
    }

}
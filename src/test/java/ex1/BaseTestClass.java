package ex1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTestClass {

    protected FirstCalc calc;

    @BeforeMethod
    public void setUp(){
        System.out.println("Test before");
        calc = new FirstCalc();
    }

    @AfterMethod
    public void tearDow(){
        System.out.println("Test after");
        calc = null;
    }
}

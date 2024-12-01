package example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest {

    @BeforeTest
    public void beforeSimpleTest() {
        System.out.println("Before Simple Test");
    }

    @AfterTest
    public void afterSimpleTest() {
        System.out.println("After Simple Test");
    }

    @Test
    public void testSimple() {
        System.out.println("The Simple Test Itself");
    }
}

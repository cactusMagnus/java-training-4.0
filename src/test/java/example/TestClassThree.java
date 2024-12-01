package example;

import org.testng.annotations.Test;

public class TestClassThree {

    @Test(priority = 5)
    public void testPriorityOne() {
        System.out.println("First test");
    }

    @Test(priority = 4)
    public void testPriorityTwo() {
        System.out.println("Second test");
    }

    @Test(priority = 1)
    public void testPriorityThree() {
        System.out.println("Third test");
    }
}

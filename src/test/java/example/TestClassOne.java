package example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestClassOne {

    @BeforeGroups(groups = "Group1")
    public void beforeGroupOne() {
        System.out.println("Executing before Group 1");
    }

    @AfterGroups(groups = {"Group1", "Group2"})
    public void afterGroups() {
        System.out.println("Executing after Groups");
    }

    @Test(groups = "Group1")
    public void testOne() {
        System.out.println("Something happens here at Group 1 test");
    }

    @BeforeGroups(groups = "Group2")
    public void beforeGroupTwo() {
        System.out.println("Executing before Group 2");
    }

    @Test(groups = "Group 2")
    public void testTwo() {
        System.out.println("Something happens at Group 2 test");
    }

}

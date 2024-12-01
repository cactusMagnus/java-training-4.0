package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {

    @Parameters({"version", "vendor"})
    @Test
    public void testParametersFromTestng(String version, String vendor) {
        System.out.println("App version is " + version);
        System.out.println("App vendor is " + vendor);
    }

    @DataProvider(name = "AppInfoProvider")
    public Object[][] getAppData() {
        return new Object[][] {
                {"version", "0.1.0"},
                {"vendor", "Some Other Company"}
        };
    }

    @Test(dataProvider = "AppInfoProvider")
    public void testParametersFromDataProvider(String query, String result) {
        System.out.println("Parameter name: " + query + ", value: " + result);
    }
}

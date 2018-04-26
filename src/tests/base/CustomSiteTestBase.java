package tests.base;


public class CustomSiteTestBase extends TestBase {

    @Override
    public void beforeTest() {
        super.beforeTest();

        log("Open tests costume website");
        navigateTo("https://mybgu.000webhostapp.com/#");
    }
}

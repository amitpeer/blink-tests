package tests.base;


public class CustomSiteTestBase extends TestBase {

    @Override
    public void beforeTest() {
        super.beforeTest();

        log("Open tests costume website");
        navigateTo("https://amitpeer05.wixsite.com/blink-tests");
    }

}

package tests.base;


public class GoogleTestBase extends TestBase {

    @Override
    public void beforeTest() {
        super.beforeTest();

        log("Navigate to Google");
        webDriver.get("https://www.google.com");
    }

}

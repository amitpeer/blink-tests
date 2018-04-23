package tests;

import org.junit.Assert;
import org.junit.Test;
import tests.base.GoogleTestBase;

public class MatrixFunctionalityTests extends GoogleTestBase {

    @Test
    public void verifyBackAction() {
        log("Navigate to a different website");
        navigateTo("https://www.wix.com");

        log("Perform back action on matrix");
        browserActions.back();

        log("Verify browser is back to first website");
        Assert.assertEquals("https://www.google.com/", webDriver.getCurrentUrl());
    }

    @Test
    public void verifyForwardAction() {
        log("Navigate to a different website");
        navigateTo("https://www.wix.com");

        log("Perform back action on matrix");
        browserActions.back();

        waitForPageToLoad();

        log("Open matrix");
        browserActions.openMatrix();

        log("Perform forward action on matrix");
        browserActions.forward();

        log("Verify browser is on the second website");
        Assert.assertEquals("https://www.wix.com/", webDriver.getCurrentUrl());
    }

    @Test
    public void verifyHomePage() {
        log("Navigate to a different website");
        navigateTo("https://www.wix.com");

        log("Go to Home Page (Google)");
        browserActions.goToHomepage();

        log("Verify browser is back to homepage");
        Assert.assertEquals("https://www.google.com/", webDriver.getCurrentUrl());
    }
}
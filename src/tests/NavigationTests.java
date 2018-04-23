package tests;

import org.junit.Assert;
import org.junit.Test;
import tests.base.CustomSiteTestBase;
import tests.base.TestBase;

public class NavigationTests extends CustomSiteTestBase {

    @Test
    public void navigateToGoogleLink() {
        log("Click on C letter");
        browserActions.goToLink().c();

        log("Verify navigation to Google occurred");
        Assert.assertEquals("https://www.youtube.com/", webDriver.getCurrentUrl());
    }
}
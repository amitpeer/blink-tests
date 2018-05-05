package tests;

import org.junit.Assert;
import org.junit.Test;
import tests.base.CustomSiteTestBase;

public class NavigationTests extends CustomSiteTestBase {

    @Test
    public void verifyNavigationToExternalLink() {
        log("Click on E letter");
        browserActions.matrix().e();

        log("Verify navigation to Google occurred");
        Assert.assertEquals("https://www.google.com/", webDriver.getCurrentUrl());
    }
}
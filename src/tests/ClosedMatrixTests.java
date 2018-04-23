package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.base.CustomSiteTestBase;

import java.util.Optional;

public class ClosedMatrixTests extends CustomSiteTestBase {

    @Override
    public void beforeTest() {
        super.beforeTest();

        log("Close matrix (enter reading state)");
        browserActions.keyboard().enterReadingState();
    }

    @Test
    public void verifyScrollDown() {
        Assert.assertFalse(getElement(By.id("button-bottom")).isPresent());

        log("Scroll scrollDown");
        browserActions.scrollDown();

        log("Verify the bottom button is visible");
        Optional<WebElement> button = getElement(By.id("button-bottom"));
        Assert.assertTrue(button.isPresent());
    }
}


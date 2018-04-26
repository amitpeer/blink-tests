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

        log("Go the Register page (has a button down the page)");
        browserActions.goToLink().b();
    }

    @Test
    public void verifyScrollDownAndUp() {
        log("Scroll scrollDown");
        browserActions.scrollDown(7);

        log("Verify the bottom button is visible");
        Optional<WebElement> button = getElement(By.id("loginbtn"));
        Assert.assertTrue(button.isPresent());

        log("Scroll up");
        browserActions.scrollUp(7);

        log("Verify the bottom header is visible");
        Optional<WebElement> header = getElement(By.id("headerTitle"));
        Assert.assertTrue(header.isPresent());
    }
}


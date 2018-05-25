package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.base.CustomSiteTestBase;
import utils.EmptyWebElement;

import java.util.Optional;

public class KeyboardTests extends CustomSiteTestBase {

    @Override
    public void beforeTest() {
        super.beforeTest();

        log("Click on letter associated with input");
        browserActions.matrix().a();
    }

    @Test
    public void verifyKeyboardOpens() {
        log("Verify keyboard is open");
        Optional<WebElement> header = getElement(By.id("muse-keyboard-container"));
        Assert.assertTrue(header.isPresent());
    }

    @Test
    public void verifyKeyboardCloses() {
        sleep(500);

        log("Close keyboard");
        browserActions.keyboard().click(1);

        log("Verify keyboard is closed");
        Optional<WebElement> header = getElement(By.id("muse-keyboard-container"));
        Assert.assertFalse(header.isPresent());
    }

    @Test
    public void verifyKeyboardWrites() {
        log("Write 'hello'");
        browserActions.keyboard().writeHello();

        log("verify 'hello' is written");
        Optional<WebElement> input = getElement(By.id("test-muse-keyboard"));
        String writtenValue = input.orElse(new EmptyWebElement()).getAttribute("value");
        Assert.assertEquals("hello", writtenValue);
    }
}
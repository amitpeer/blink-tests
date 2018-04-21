package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Optional;

public class GoogleKeyboardTests extends TestBase {

    @Override
    public void beforeTest() {
        super.beforeTest();

        log("Open keyboard");
        browserActions.keyboard().openGoogleKeyboard();
    }

    @Test
    public void verifyGoogleKeyboardOpens() {
        log("Verify that google keyboard is opened properly");
        Optional<WebElement> googleKeyboard = getElement(By.id("kbd"));
        Assert.assertEquals(true, googleKeyboard.isPresent());
    }

    @Test
    public void verifyKeyboardWritesToInput() {
        log("Write 'Shalom' in keyboard");
        browserActions.keyboard().writeShalom();

        log("Verify 'Shalom' is written in text input");
    }
}

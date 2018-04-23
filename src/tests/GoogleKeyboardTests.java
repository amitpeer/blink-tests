package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.base.GoogleTestBase;

import java.util.Optional;

public class GoogleKeyboardTests extends GoogleTestBase {

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
        Assert.assertTrue(googleKeyboard.isPresent());
    }

    @Test
    public void verifyKeyboardWritesToInput() {
        log("Write 'Shalom' in keyboard");
        browserActions.keyboard().writeShalom();

        log("Perform search");
        browserActions.keyboard().search();

        log("Verify 'Shalom' is written in text input");
    }
}


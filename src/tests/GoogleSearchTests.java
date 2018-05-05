package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.base.GoogleTestBase;

import java.util.Optional;

public class GoogleSearchTests extends GoogleTestBase {

    @Override
    public void beforeTest() {
        super.beforeTest();

        log("Open keyboard");
        sleep(500);
        browserActions.matrix().a();
    }

    @Test
    public void verifyKeyboardOpens() {
        sleep(500);

        log("Verify that google keyboard is opened properly");
        Optional<WebElement> googleKeyboard = getElement(By.id("muse-keyboard-container"));
        Assert.assertTrue(googleKeyboard.isPresent());
    }

    @Test
    public void verifySearchWorks() {
        log("Write 'Hello' in keyboard");
        browserActions.keyboard().writeHello();

        log("Close keyboard");
        browserActions.keyboard().goToCloseButtonFromO();

        log("Perform search");
        browserActions.matrix().search();

        log("Verify search happened");
        Assert.assertThat(webDriver.getCurrentUrl(), CoreMatchers.containsString("hello"));
    }
}


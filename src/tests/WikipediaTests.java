package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.base.TestBase;

import java.util.Optional;

/**
 * Created by amitp on 05/05/2018
 */
public class WikipediaTests extends TestBase {


    @Override
    public void beforeTest() {
        super.beforeTest();

        log("Navigate to Wikipedia");
        navigateTo("https://www.wikipedia.org");

        sleep(500);

        browserActions.matrix().a();
    }

    @Test
    public void verifyKeyboardOpens() {
        sleep(500);

        log("Verify that wikipedia keyboard is opened properly");
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

        log("Verify search is working properly");
        Assert.assertThat(webDriver.getCurrentUrl().toLowerCase(), CoreMatchers.containsString("hello"));
    }

}

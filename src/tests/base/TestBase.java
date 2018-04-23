package tests.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.BrowserActions;
import utils.Utils;

import java.io.File;
import java.util.Optional;

public class TestBase {

    protected WebDriver webDriver;
    protected BrowserActions browserActions;

    @Before
    public void beforeTest() {
        ChromeOptions options = new ChromeOptions();

        options.addExtensions(new File("C:\\projects\\final-project\\angular-muse-extension\\dist.crx"));
        options.addArguments("start-maximized");

        System.setProperty("webdriver.chrome.driver", "libs//chromedriver.exe");

        log("Set up web driver");
        webDriver = new ChromeDriver(options);

        browserActions = new BrowserActions(webDriver);

        browserActions.openExtension();
    }

    @After
    public void afterTest() {
        webDriver.close();
    }

    protected void log(String message) {
        System.out.println("*** Test Step: " + message + " ***");
    }

    protected void sleep(long ms) {
        Utils.sleep(ms);
    }

    protected boolean isElementPresent(By by) {
        try {
            webDriver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected Optional<WebElement> getElement(By by) {
        Optional<WebElement> webElement;

        try {
            Utils.sleep(500);
            webElement = Optional.of(webDriver.findElement(by));
        } catch (NoSuchElementException e) {
            webElement = Optional.empty();
        }

        return webElement;
    }

    protected void navigateTo(String url) {
        webDriver.get(url);
        sleep(1000);
    }

    protected void waitForPageToLoad() {
        sleep(2000);
    }
}

package utils;

import org.openqa.selenium.WebDriver;

import java.awt.event.KeyEvent;

public class BrowserActions {

    WebDriver webDriver;

    public BrowserActions(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public GoogleKeyboardUtils keyboard() {
        return new GoogleKeyboardUtils();
    }

    public void openExtension() {
        RobotUtils.robotKeyPress(KeyEvent.VK_CONTROL, KeyEvent.VK_SHIFT, KeyEvent.VK_Y);
        RobotUtils.robotKeyRelease(KeyEvent.VK_CONTROL, KeyEvent.VK_SHIFT, KeyEvent.VK_Y);

        Utils.sleep(2000);
    }
}

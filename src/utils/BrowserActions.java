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

    public void back() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);
    }

    public void forward() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 2);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);
    }

    public void openMatrix() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);

        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_UP, 10);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_LEFT, 5);
    }

    public void goToHomepage() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);
    }

    public MatrixLettersNavigator goToLink() {
        return new MatrixLettersNavigator();
    }

    public void scrollDown(int amount) {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, amount);
    }

    public void scrollUp(int amount) {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_UP, amount);
    }
}

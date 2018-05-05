package utils;

import java.awt.event.KeyEvent;

import static utils.Utils.sleep;

public class KeyboardUtils {

    public KeyboardUtils() {
    }

    public void click(int times) {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER, times);
    }

    public void goToCloseButtonFromO() {
        RobotUtils.robotKeyPressAndReleaseNoDelay(KeyEvent.VK_UP, 1);
        RobotUtils.robotKeyPressAndReleaseNoDelay(KeyEvent.VK_LEFT, 9);
        click(1);
    }

    public void pressCapsLock() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 4);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_UP, 4);
    }

    public void search() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_UP, 1);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 2);

        click(1);

        sleep(500);
    }

    public void writeHello() {
        // H
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 2);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 6);
        click(1);

        // E
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_UP);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_LEFT, 3);
        click(1);

        // LL
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 6);
        click(2);

        // O
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_UP);
        click(1);
    }

    public void enterReadingState() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 3);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);
    }
}

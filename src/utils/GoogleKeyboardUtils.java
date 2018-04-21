package utils;

import java.awt.event.KeyEvent;

public class GoogleKeyboardUtils {

    public GoogleKeyboardUtils() {
    }

    public void openGoogleKeyboard() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);

        Utils.sleep(1500);
    }

    public void pressCapsLock() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 4);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_UP, 4);
    }

    public void writeShalom() {
        // Shin
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 3);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);

        // Lamed
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 7);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);

        // Vav
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_UP);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_LEFT);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);

        // Mem
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 2);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);

    }
}

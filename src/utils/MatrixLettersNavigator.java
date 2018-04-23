package utils;

import java.awt.event.KeyEvent;

public class MatrixLettersNavigator {

    public void a() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 3);

        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);
    }

    public void c() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 2);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);
    }

}

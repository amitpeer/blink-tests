package utils;

import java.awt.event.KeyEvent;

public class MatrixLettersNavigator {

    public void a() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 2);

        enter();
    }

    public void b() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 2);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 1);

        enter();
    }

    public void c() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 2);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 2);

        enter();
    }

    public void d() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 2);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 3);

        enter();
    }

    public void e() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 3);

        enter();
    }

    private void enter() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);

    }

}

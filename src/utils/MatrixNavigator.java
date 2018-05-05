package utils;

import java.awt.event.KeyEvent;

public class MatrixNavigator {

    public void a() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 2);
        click();
    }

    public void b() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 2);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 1);
        click();
    }

    public void c() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 2);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 2);
        click();
    }

    public void d() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 2);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 3);
        click();
    }

    public void e() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 3);
        click();
    }

    public void closeMatrix() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 3);
        click();
    }

    public void search() {
        goToTopLeft();

        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_DOWN, 1);
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_RIGHT, 2);

        click();
    }

    public void goToTopLeft() {
        RobotUtils.robotKeyPressAndReleaseNoDelay(KeyEvent.VK_UP, 8);
        RobotUtils.robotKeyPressAndReleaseNoDelay(KeyEvent.VK_LEFT, 4);
    }

    private void click() {
        RobotUtils.robotKeyPressAndRelease(KeyEvent.VK_ENTER);
    }

}

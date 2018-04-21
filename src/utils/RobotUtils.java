package utils;

import java.awt.*;

public final class RobotUtils {

    private static Robot robot;

    private RobotUtils() {
    }

    public static void robotKeyPressAndRelease(int key, int times) {
        for (int i = 0; i < times; i++) {
            robot.keyPress(key);
            robot.keyRelease(key);
            Utils.sleep(200);
        }
    }

    public static void robotKeyPressAndRelease(int... keys) {
        for (int k : keys) {
            robot.keyPress(k);
            robot.keyRelease(k);
            Utils.sleep(200);
        }
    }

    public static void robotKeyPress(int... keys) {
        for (int k : keys) {
            robot.keyPress(k);
        }
    }

    public static void robotKeyRelease(int... keys) {
        for (int k : keys) {
            robot.keyRelease(k);
        }
    }

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            System.out.println("Could not init Robot: " + e.getMessage());
        }
    }
}

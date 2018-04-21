package utils;

public final class Utils {

    private Utils() {}

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Sleep error: " + e.getMessage());
        }
    }
}

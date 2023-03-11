package rikkei.academy;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = baseArea * perimeter;
        return volume;
    }

    private static double getPerimeter(int radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    private static double getBaseArea(int radius) {
        double baseArea = Math.PI * Math.pow(radius, 2);
        return baseArea;
    }
}

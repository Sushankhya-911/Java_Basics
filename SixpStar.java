package com.java.day12;

public class SixpStar {
    public static void main(String[] args) {
        // 'r' controls the size of the star. 
        // 15-20 is ideal for standard console font sizing.
        int r = 15; 

        // Loop through the Y and X grid coordinates
        for (int y = r; y >= -r; y--) {
            for (int x = -2 * r; x <= 2 * r; x++) {
                
                // Convert grid coordinates to floating point
                // x is scaled by 0.5 because console characters are taller than they are wide
                double dx = x * 0.5;
                double dy = y;

                // Check the geometry conditions for a 5-pointed star
                if (isInsideStar(dx, dy, r)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Mathematical formula to determine if a point (x,y) falls inside a 5-pointed star
    private static boolean isInsideStar(double x, double y, double r) {
        // Approximate geometric constraints of a perfect pentagram
        double a = Math.PI / 2; // 90 degrees (Top vertex)
        double da = 2 * Math.PI / 5; // Angle between points (72 degrees)

        // Count how many half-planes the point crosses
        int crossings = 0;
        for (int i = 0; i < 5; i++) {
            // Calculate two consecutive outer vertices of the star
            double x1 = r * Math.cos(a + i * da * 2);
            double y1 = r * Math.sin(a + i * da * 2);
            double x2 = r * Math.cos(a + (i + 1) * da * 2);
            double y2 = r * Math.sin(a + (i + 1) * da * 2);

            // Ray-casting algorithm logic to see if the point is inside the star boundary
            if (((y1 > y) != (y2 > y)) && (x < (x2 - x1) * (y - y1) / (y2 - y1) + x1)) {
                crossings++;
            }
        }
        // If the number of line crossings is odd, the point is inside the star shape
        return crossings % 2 != 0;
    }
}

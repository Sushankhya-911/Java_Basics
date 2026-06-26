package com.java.day12;

public class Man {

    public static void main(String[] args) {
        
        // 1. THE HEAD (A small box/circle shape)
        System.out.println("   *** ");
        System.out.println("   * * ");
        System.out.println("   *** ");

        // 2. THE NECK
        System.out.println("    * ");

        // 3. THE ARMS & UPPER TORSO
        // Row 1 of arms: hands pointing slightly up/out
        System.out.println("  * * * ");
        // Row 2 of arms: straight across
        System.out.println("********* ");

        // 4. THE LOWER TORSO (Spine)
        System.out.println("    * ");
        System.out.println("    * ");

        // 5. THE LEGS (An inverted V-shape)
        int legHeight = 4;
        for (int i = 1; i <= legHeight; i++) {
            // Print spaces before the left leg
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*"); // Left leg

            // Print spaces between the two legs
            for (int k = 1; k < (i * 2); k++) {
                System.out.print(" ");
            }
            System.out.println("*"); // Right leg
        }
    }
}


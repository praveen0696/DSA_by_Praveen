package Patterns;

public class Inverted_Rotated_Half_Pyramid {
    public static void inverted_rotated_half_pyramid(int n) {
        // Outer
        for (int i = 0; i < n; i++) {
            // Spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rotated_half_pyramid(4);
    }
}

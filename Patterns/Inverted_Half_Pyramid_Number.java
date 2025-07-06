package Patterns;

public class Inverted_Half_Pyramid_Number {
    public static void inverted_half_pyramid_number(int n) {
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
inverted_half_pyramid_number(4);
    }
}

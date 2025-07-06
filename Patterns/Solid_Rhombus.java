package Patterns;

public class Solid_Rhombus {
    public static void solid_rhombus(int n){
        for(int i=0; i<=n; i++){
            // Spaces
            for(int j=0; j<(n-i); j++){
                System.out.print(" ");
            }

            // Stars
            for(int j=0; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid_rhombus(5);
    }
}

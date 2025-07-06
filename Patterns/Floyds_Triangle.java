package Patterns;

public class Floyds_Triangle {
    public static void floyds_triangle(int n){
        int num=1;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" "+num++);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds_triangle(4);
    }
}

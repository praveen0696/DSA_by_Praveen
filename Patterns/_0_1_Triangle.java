package Patterns;

public class _0_1_Triangle {
    public static void _0_1_triangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        _0_1_triangle(4);
    }
}

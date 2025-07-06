package Patterns;

public class Butterfly {
    public static void butterfly(int n){
        // 1st half
        for(int i=0; i<=n; i++){
            //stars -i
            for(int j=0; j<i; j++){
                System.out.print("*");
            }

            // spaces - 2*(n-i) 
             for(int j=0; j<2*(n-i); j++){
                System.out.print(" ");
            }

            // stars -i
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=n; i>=0; i--){
            //stars -i
            for(int j=0; j<i; j++){
                System.out.print("*");
            }

            // spaces - 2*(n-i) 
             for(int j=0; j<2*(n-i); j++){
                System.out.print(" ");
            }

            // stars -i
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly(5);
    }
}

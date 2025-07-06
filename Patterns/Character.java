package Patterns;

public class Character {
public static void main(String[] args) {
    char ch = 65;
    int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }    
}

import java.util.Scanner;

public class Basic_Operation {

    // Search the element form matrix
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {

        // 2D Array Creation
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 numbers for the 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("Your 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Search
        System.out.println(search(matrix, 7));

        sc.close();

    }
}

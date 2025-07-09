import java.util.Scanner;

public class Operations
{
    public static void  main(String args[])
    {
        // Create
        int marks[] = new int[50];

        // Input
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // Output
        System.out.println("Phy : "+marks[0]);
        System.out.println("Chem : "+marks[1]);
        System.out.println("Maths : "+marks[2]);

        // Update
        marks[2] = 100;
        System.out.println("Updated Number of maths: "+marks[2]);

        // Percentage
        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage is : "+percentage + "%");

        // Length of Array
        System.out.println("Length of Array : "+ marks.length);
        sc.close();
    }
}

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // Creation
        // String str = "abcd";
        // String str2 = new String("xyz"); // Using new keyword 

        // input 
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        // length is a function in String and In array , it is a property.
        String name1 = "Praveen Sharma";
        System.out.println(name1.length());

        // Concatenation
        String firstName = "Praveen";
        String lastName = "Sharma";
        System.out.println(firstName + " " + lastName);

        // charAt function
        System.out.println(lastName.charAt(2));

        sc.close();

    }
}

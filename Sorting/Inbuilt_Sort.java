package Sorting;
import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr); // It's execute for Ascending order
        // Arrays.sort(arr , Collections.reverseOrder()); //It's execute for Decending order
        printArr(arr);
    }
}

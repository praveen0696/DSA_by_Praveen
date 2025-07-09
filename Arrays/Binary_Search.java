public class Binary_Search {
    public static int BinaryNumber(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            } else if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int key = 10;
        int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        System.out.println("Index for key is : "+BinaryNumber(num, key));
    }
}

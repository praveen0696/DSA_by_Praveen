public class Max_Subarray_Sum_Kadanes{
    public static void kadanes(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
           currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum , maxSum);
        }
        System.out.println("Max Sum is :" + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
        kadanes(arr);
    }
}

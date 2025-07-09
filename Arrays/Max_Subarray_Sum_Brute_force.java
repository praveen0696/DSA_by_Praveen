public class Max_Subarray_Sum_Brute_force {
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                    System.out.println(maxSum);
                }

            }
        }
        System.out.println("Max Sum is :" + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1 , -2 , 6 , -1 , 3};
        maxSubarraySum(arr);
    }
}

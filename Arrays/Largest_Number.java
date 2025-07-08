public class Largest_Number {
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i=0; i<num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 6 , 3 , 5};
        System.out.println("Largest Number is : " + getLargest(arr));
    }
}

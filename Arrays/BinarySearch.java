package Arrays;

public class BinarySearch 
{
    public static int BinaryNumber(int num[] , int key)
    {
        int start = 0;
        int end = num.length -1;
        while (start <= end) 
        {
            int mid = (start+end)/2;

            if(mid == key)
            {
                System.out.println("Key is found at index : "+mid);
            }
            else if(mid < key)
            {
                mid = mid + 1;
            }
            else if(mid > key)
            {
                mid = mid - 1;
            }
            return mid;
        }
        return -1; 
    }  
    
    public static void main(String args[])
    {
        int key = 10;
        int num[] = { 2, 4 , 6 , 8 , 10 , 12 , 14};
        System.out.println(BinaryNumber(num, key));
    }
}

// Any element appear at least twice in the array
public class Twice_Element {
    public static boolean twiceElement(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1  , 2 , 3 , 1};
        System.out.println(twiceElement(arr));
    }
}

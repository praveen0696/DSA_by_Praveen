public class Trapping_Rainwater {
    public static int trappedWater(int arr[]) {

        // Calculate left max boundary - array
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        // Calculate right max boundary - array
        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        // Loop
        for(int i=0; i<arr.length; i++){
            // Water_level = min(leftMax , rightMax)
            int Water_level = Math.min(leftMax[i], rightMax[i]);
            
            // trappedwater = water level - height
            trappedWater += Water_level - arr[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int total = trappedWater(height);
        System.out.println(total);
    }
}

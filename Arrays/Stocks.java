public class Stocks {
    public static int maxProfit(int prices[]) {
        int maxProfit = 0;
        int buying_Price = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(buying_Price < prices[i]){
                int profit = prices[i] - buying_Price; // Profit
                maxProfit = Math.max(maxProfit,profit); // today's profit
            }
            else{
                buying_Price = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7 , 1 , 5 , 3 , 6 , 4};
        System.out.println(maxProfit(prices));
    }
}

package Arrays;
public class BuyandSellStocks {
    public static void main(String[] args) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int prices [] = {7,1,5,3,6,4};
//        for(int i = 0; i<prices.length; i++){
//            if (prices[i] < minPrice){
//                minPrice = prices[i];
//            } else if (prices[i] - minPrice > maxProfit){
//                maxProfit = prices[i] - minPrice;
//            }
//        }
        int mini = 0;
        for(int i=1;i<prices.length;i++){
            int curProfit = prices[i] - mini;
            maxProfit = Math.max(maxProfit,curProfit);
            mini = Math.min(mini,prices[i]);
        }
        System.out.println(maxProfit);
    }
}

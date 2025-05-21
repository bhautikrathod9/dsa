class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for(int i=0; i<prices.length; i++){
            // for(int j=i+1; j<prices.length; j++){
            //     profit = prices[j] - prices[i];
            //     if(profit > maxProfit){
            //         maxProfit = profit;
            //     }
            // }

            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }
            
            int profitOnDay = prices[i] - buyPrice;
            if(profit < profitOnDay){
                profit = profitOnDay;
            }
        }

        if(profit < 1){
            return 0;
        }else{
            return profit;
        }
    }
}
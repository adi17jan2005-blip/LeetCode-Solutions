class Solution {
    public int maxProfit(int[] prices) {
        //i assume i have bought at minimum price
        int buying=prices[0];
        int n=prices.length;
        int maxprofit=0;
        for(int i=0;i<n;i++)
        {
            int cost=prices[i]-buying;
            maxprofit=Math.max(maxprofit,cost);
            buying=Math.min(buying,prices[i]);
        }
        return maxprofit;

        
    }
}
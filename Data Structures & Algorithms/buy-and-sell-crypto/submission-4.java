class Solution {
    public int maxProfit(int[] arr) {
        int len = arr.length;
        int buy = 0;
        int sell = 1;
        int maxProfit = Integer.MIN_VALUE;

        if (len == 1)
            return 0;

        while(buy < sell && sell < len){
            if(arr[buy] > arr[sell]){
                buy = sell;
            }
            else if(arr[buy] <= arr[sell]){
                var profit = arr[sell] - arr[buy];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
            sell++;
        }

        return Math.max(maxProfit, 0);
    }
}

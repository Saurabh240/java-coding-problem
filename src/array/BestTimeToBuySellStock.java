package array;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(BestTimeToBuySellStock.maxProfit(arr));;
    }
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0;i<prices.length;i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(prices[i]-minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }

        }
        return maxProfit;
    }

    /*
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0;i<prices.length;i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(prices[i]-minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }

        }
        return maxProfit;
    }
     */
/*Brute Force Approach
public int maxProfit(int[] prices) {
        int maxProfit =0;
        for(int i=0;i<prices.length-1;i++) {
            for(int j=i+1;j<prices.length;j++) {
                int profit = prices[j]-prices[i];
                if(profit > maxProfit) {
                    maxProfit = profit;
                }

            }
        }
        return maxProfit;
    }
*/
    /* Brute Force Approach
public int maxProfit(int[] prices) {
        int maxProfit =0;
        for(int i=0;i<prices.length-1;i++) {
            for(int j=i+1;j<prices.length;j++) {
                int profit = prices[j]-prices[i];
                if(profit > maxProfit) {
                    maxProfit = profit;
                }

            }
        }
        return maxProfit;
    }
*/
}

/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Best time to buy and sell stock
*Problem Source : Coding Ninjas
* 
*/

public class Best_Time_to_Buy_And_Sell_Stock {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int min = prices[0];
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                max=Math.max(prices[i]-min,max);
            }
        }
        return max;
    }
}

/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Best Time to Buy and Sell Stock
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
* 
*/

class Best_Time_To_Buy_And_Sell_Stock {
    public int maxProfit(int[] prices) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int sum=0,x=-1;
        for(int i=0;i<prices.length;i++){
            if(arr.size()==0){
                arr.add(prices[i]);
                x++;
            }
            else{
                if(arr.get(x)<prices[i]){
                    for(int j=0;j<arr.size();j++)
                    sum=Math.max(sum,prices[i]-arr.get(j));
                }
                else{
                    arr.add(prices[i]);
                    x++;
                }
            }
        }
        return sum;
    }
}

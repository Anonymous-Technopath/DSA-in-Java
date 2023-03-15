/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Best Time to Buy and Sell Stock II
*Problem Source : Coding Ninjas
* 
*/

public class Best_Time_To_Buy_And_Sell_Stock_II {
    public static long getMaximumProfit (int n, long[] values) {
        // Your code goes here.
        long sum=0;
        for(int i=0;i<n-1;i++){
            if(values[i]<values[i+1]){
                sum+=values[i+1]-values[i];
            }
        }
        return sum;
    }
}

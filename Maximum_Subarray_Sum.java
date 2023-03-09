/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Maximum Subarray Sum
*Problem Source : Coding Ninjas
* 
*/

public class Maximum_Subarray_Sum{
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long cur_sum=0;
		long max_sum=0;
		for(int i=0;i<n;i++){
			cur_sum+=arr[i];
			max_sum=Math.max(max_sum,cur_sum);
			if(cur_sum<0){
				cur_sum=0;
			}
		}
		return max_sum;
	}

}

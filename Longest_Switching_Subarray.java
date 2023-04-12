/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Longest Switching Subarray
*Problem Source : Coding Ninjas
* 
*/

public class Longest_Switching_Subarray {	
	public static int switchingSubarray(int[] arr, int n) {
		// Write your code here.
		if(n<=2){
			return n;
		}
		int even = arr[0];
		int odd = arr[1];
		int max = 1;
		int cur = 0;
		int i = 0;
		while(i<n-1){
			if(i%2==0){
				if(even!=arr[i]){
					even=arr[i];
					odd=arr[i-1];
					i--;
					cur = 0;
					continue;
				}
			}else{
				if(odd!=arr[i]){
					odd = arr[i];
					even = arr[i-1];
					i--;
					cur = 0;
					continue;
				}
			}
			cur++;
			i++;
			max=Math.max(max,cur);
		}
		if(i%2==0){
			if(even!=arr[n-1]){
				even=arr[n-1];
				odd=arr[n-2];
				cur = 0;
			}
		}else{
			if(odd!=arr[n-1]){
				odd = arr[n-1];
				even = arr[n-2];
				cur = 0;
			}
		}
		cur++;
		max=Math.max(max,cur);
		return max;
	}
}

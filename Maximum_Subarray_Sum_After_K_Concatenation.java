/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Maximum subarray sum after K concatenation
*Problem Source : Coding Ninjas
* 
*/

public class Maximum_Subarray_Sum_After_K_Concatenation {

	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		// Write your code here.
		 long sum = 0;
        for(int i=0; i < n; i++){
            sum += arr.get(i);
        }
        if(sum<0){
			sum=0;
		}
        long currSum =arr.get(0);
        long res = currSum;
        for(int i =1; i < n*2; i++){
            if(currSum < 0){
                currSum = arr.get(i%arr.size());
            }
            else{
                currSum += arr.get(i%arr.size());
            }
            res = Math.max(res, currSum);
        }
        res += sum*(k-2);
        return res;
	}
}

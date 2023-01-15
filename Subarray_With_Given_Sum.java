/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Subarray with given sum
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/
* 
*/

class Subarray_With_Given_Sum
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> sol=new ArrayList<Integer>();
        int left=0;
        int right=0;
        int sum=0;
        if(s==0){
            sol.add(-1);
            return sol;
        }
        while(left<n || right<n){
            if(sum==s){
                sol.add(left+1);
                sol.add(right);
                return sol;
            }
            else if(sum<s && right<=n-1){
                sum=sum+arr[right];
                right++;
            }
            else{
                sum=sum-arr[left];
                left++;
            }
        }
        sol.add(-1);
        return sol;
    }
}

/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Subarray with 0 sum
*Problem Source : Geeks For Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/
* 
*/

class Subarray_With_0_Sum{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashSet<Integer> hs=new HashSet<>();
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                return true;
            }
            sum+=arr[i];
            if(sum==0 || hs.contains(sum)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
}

/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Subarray Sums Divisible by K
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/subarray-sums-divisible-by-k/
* 
*/

class Subarray Sums_Divisible_By_K{
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        long sum=0;
        int count=0;
        hs.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int x= (int)(sum%k);
            if(x<0){
                x+=k;
            }
            if(hs.containsKey(x)){
                count+=hs.get(x);
                hs.put(x,hs.get(x)+1);
            }else{
                hs.put(x,1);
            }
        }
        return count;
    }
}

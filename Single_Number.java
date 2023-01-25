/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Single Number
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/single-number/
* 
*/

class Single_Number{
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                hs.put(nums[i],2);
            }else{
                a.add(nums[i]);
                hs.put(nums[i],1);
            }
        }
        for(int i=0;i<a.size();i++){
            if(hs.get(a.get(i))==1){
                return a.get(i);
            }
        }
        return -1;
    }
}

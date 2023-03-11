/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Count all sub-arrays having sum divisible by k
*Problem Source : Coding Ninjas
* 
*/

public class Count_All_Sub_Arrays_Having_Sum_Divisible_By_K {

    public static int subArrayCount(ArrayList < Integer > arr, int k) {

    	 // Write your code here.
         HashMap<Integer,Integer> hs=new HashMap<>();
         long sum=0;
         int count=0;
         hs.put(0,1);
         for(int i=0;i<arr.size();i++){
             sum+=arr.get(i);
             int x=(int)(sum%k);
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

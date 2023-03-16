/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Longest Consecutive Sequence
*Problem Source : Coding Ninjas
* 
*/

public class Longest_Consecutive_Sequence {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        int cur=1,max=1;
        for(int i:arr){
            if(!hs.contains(i-1)){
                cur=1;
                while(hs.contains(i+cur)){
                    cur++;
                }
                max=Math.max(cur,max);
            }
        }
        return max;
    }
}

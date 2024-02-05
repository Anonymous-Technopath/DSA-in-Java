/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem :  Longest Substring Without Repeating Characters
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class  Longest_Substring_Without_Repeating_Character 
{
	public static int uniqueSubstrings(String s) 
    {
		//write your code here
		int max=1;
		int l=0,r=0;
		HashMap<Character,Integer> hm=new HashMap<>();
		hm.put(s.charAt(0),0);
		while(l<=r &&r<s.length()){
			r++;
			if(r==s.length()){
				break;
			}
			if(hm.containsKey(s.charAt(r))){
				int i=hm.get(s.charAt(r));
				while(l<=i){
					hm.remove(s.charAt(l));
					l++;
				}
			}
			hm.put(s.charAt(r),r);
			max=Math.max(r-l+1,max);

		}
		return max;
	}
}

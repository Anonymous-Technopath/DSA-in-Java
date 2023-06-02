/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Longest Substring Without Repeating Characters
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Longest_Substring_Without_Repeating_Characters {
        
	public static int lengthOfLongestSubstring(String s) {
		// Write your code here.
		int n=1,l=0,r=1;
		if(s.length()==0){
			return 0;
		}
		boolean t=false;
		HashSet<Character> hs=new HashSet<>();
		hs.add(s.charAt(0));
		while(r<s.length()){
			if(!hs.contains(s.charAt(r))){
				hs.add(s.charAt(r));
				n=Math.max(hs.size(),n);
				r++;
			}else{
				hs.remove(s.charAt(l));
				l++;
			}
		}
		
		return n;
	}
}

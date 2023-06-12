/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Fruits and Baskets
*Problem Source : Coding Ninjas 
*
*/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Fruits_and_Baskets {
	public static int findMaxFruits(String s, int n) {
		// Write your code here.
		HashSet<Character> hs=new HashSet<>();
		if(n==0){
			return 0;
		}
		int max = 1,last = 0,sum=0;
		hs.add(s.charAt(0));
		for(int i=1;i<n;i++){
			if(s.charAt(i-1)==s.charAt(i)){
				max = Math.max(max,i-sum+1);
			}else if(hs.contains(s.charAt(i))){
				last = i-1;
				max = Math.max(max,i-sum+1);
			}else if(hs.size()<2){
				if(s.charAt(i-1)!=s.charAt(i)){
					last = i-1;
				}
				hs.add(s.charAt(i));
				max = Math.max(max,i-sum+1);
			}else{
				sum = last+1;
				hs.remove(s.charAt(last));
				hs.add(s.charAt(i));
				max = Math.max(max,i-sum+1);
				last=i-1;
			}
		}
		return max;
	}
}

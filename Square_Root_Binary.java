/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Square Root
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 

public class Square_Root_Binary {

	public static int sqrtN(long N) {
		long start = 0;
		long end = N;
		long ans=0;
		long mid= start+(end-start)/2;
		while(start<=end){
			mid= start+(end-start)/2;
			if(mid*mid==N){
				return (int)mid;
			}else if(mid*mid>N){
				end=mid-1;
			}else{
				ans=mid;
				start=mid+1;
			}
		}
		return (int)ans;
	}
}

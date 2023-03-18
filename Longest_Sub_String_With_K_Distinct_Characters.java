/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Longest Sub-string With K Distinct Characters
*Problem Source : Coding Ninjas
* 
*/

public class Longest_Sub_String_With_K_Distinct_Characters {
	public static int getLengthofLongestSubstring(String s, int k) {
		// Write your code here.
		HashMap<Character,Integer> hs=new HashMap<>();
		int l=0,r=0,max=0;
		while(r<s.length()){
			if(!hs.containsKey(s.charAt(r)) && k==0){
				while(true){
					hs.put(s.charAt(l),hs.get(s.charAt(l))-1);
					l++;
					if(hs.get(s.charAt(l-1))==0){
						hs.remove(s.charAt(l-1));
						k++;
						break;
					}
				}
			}
			if(!hs.containsKey(s.charAt(r))){
				hs.put(s.charAt(r),1);
				k--;				
			}else{
				hs.put(s.charAt(r),hs.get(s.charAt(r))+1);
			}
			max=Math.max(r-l+1,max);
			r++;
		}
		return max;
	}
}

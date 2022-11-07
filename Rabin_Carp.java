/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Rabin Carp
*Problem Source : Love Babbar DSA Sheet,Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/stringmatch-rabincarp_1115738?topList=love-babbar-dsa-sheet-problems
* 
*/
import java.util.*;

public class Rabin_Carp {
	public static ArrayList<Integer> stringMatch(String str, String pat) {
		// Write your code here.
        ArrayList<Integer> arr = new ArrayList<Integer>();
        StringBuffer s=new StringBuffer(str);
        int i=0;
        while(s.indexOf(pat)!=-1){
            arr.add(s.indexOf(pat)+i);
           s.deleteCharAt(s.indexOf(pat));
            i++;
        }
        return arr;
	}
}
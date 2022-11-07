/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Shuffle Two Strings
*Problem Source : Love Babbar DSA Sheet ,Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/shuffle-two-strings_1115692?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0
* 
*/

import java.util.* ;
import java.io.*; 
public class Shuffle_Two_Strings {
    public static boolean rec(String a, String b, String c,int i1,int i2,int i3){
        if(i1==a.length() && i2==b.length()){
            return true;
        }
        if(i1==a.length()){
            if(b.charAt(i2)==c.charAt(i3)){
                return rec(a,b,c,i1,i2+1,i3+1);
            }
            return false;
        }
        if(i2==b.length()){
            if(a.charAt(i1)==c.charAt(i3)){
                return rec(a,b,c,i1+1,i2,i3+1);
            }
            return false;
        }
        boolean b1=false,b2=false;
        if(a.charAt(i1)==c.charAt(i3)){
            b1= rec(a,b,c,i1+1,i2,i3+1);
        }
        if(b.charAt(i2)==c.charAt(i3)){
            b2= rec(a,b,c,i1,i2+1,i3+1);
        }
        return b1||b2;
    }
	public static boolean isInterleave(String a, String b, String c) {
		if(a.length()+b.length()!=c.length()){
            return false;
        }
        return rec(a,b,c,0,0,0);
	}
}
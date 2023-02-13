/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Overlapping ABBA
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/two-substrings_920397
* 
*/

public class Overlapping_ABBA{
    public static boolean findOverlap(String s){
        // Write your code here.
        int x=s.indexOf("AB");
        int y=s.indexOf("BA");
        if(Math.abs(x-y)==1||x==-1 ||y==-1){
            return false;
        }
        return true;
    }
}

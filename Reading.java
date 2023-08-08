/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Reading
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Reading {
    public static String read(int n, int []book, int target){
        // Write your code here.
        Arrays.sort(book);
        int l=0,r=n-1;
        while(l<=r){
            if(book[l]+book[r]==target){
                return "YES";
            }else if(book[l]+book[r]<target){
                l++;
            }
            else{
                r--;
            }
        }
        return "NO";
    }
}

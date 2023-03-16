/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Minimum Number of Platforms
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Minimum_Number_Of_Platforms {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);
        int i=0,j=0,cur=0,max=0;
        while(i<n && j<n){
            if(dt[i]<at[j]){
                i++;
                cur--;
            }else{
                j++;
                cur++;
            }
            if(max<cur){
                max=cur;
            }
        }
        return max;
    }
}

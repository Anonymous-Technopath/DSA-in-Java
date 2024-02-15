/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Largest rectangle in a histogram
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Largest_Rectangle_In_A_Histogram {
    public static int sumSubarrayMins(int []arr) {
        // Write your code here.
        
        int n=arr.length;
        long sum=0;
        Stack<Integer> s=new Stack<>();
        int temp[]=new int[n];
        int mod=1000_000_007;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                temp[s.pop()]=i;
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            temp[s.pop()]=n;
        }
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>arr[i]){
                sum+=(((temp[s.peek()]-s.peek())*arr[s.peek()]*(s.pop()-i)));
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            sum+=(((temp[s.peek()]-s.peek())*arr[s.peek()]*(s.pop()+1)));
        }
        return (int)(sum%mod);
    }
}

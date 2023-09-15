/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Add Binary
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/add-binary/
* 
*/

import java.util.*;
public class Superior_Elements {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer> arr= new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]>max){
                arr.add(a[i]);
                max = a[i];
            }
        }
        return arr;
    }
}

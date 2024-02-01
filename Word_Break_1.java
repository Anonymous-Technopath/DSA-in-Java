/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Word Break-1
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Word_Break_1 {
	static void merge(String arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        // Create temp arrays 
        String L[] = new String[n1]; 
        String R[] = new String[n2]; 
  
        // Copy data to temp arrays 
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1 + j]; 
  
        // Merge the temp arrays 
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarray array 
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i].length() <= R[j].length()) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        // Copy remaining elements of L[] if any 
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        // Copy remaining elements of R[] if any 
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
	static void sort(String arr[], int l, int r) 
    { 
        if (l < r) { 
            // Find the middle point 
            int m = (l + r) / 2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr, m + 1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
	public static void rec(String s,String[] dict,StringBuilder a,HashSet<String> sol){
		if(s.equals("")){
			sol.add(a.substring(1,a.length()));
			return;
		}
		int n=s.length();
		for(String d:dict){
			int l=d.length();
			if(n<l){
				return;
			}
			if(s.substring(0,l).equals(d)){
				a.append(" "+d);
				rec(s.substring(l,n),dict,a,sol);
				a.delete(a.length()- l - 1,a.length());
			}
		}
	}
    public static List< String > getAllValidSentences(String s, String []dict) {
        //  write your code here.
		HashSet<String> sol=new HashSet<>();
		sort(dict,0,dict.length-1);
		rec(s,dict,new StringBuilder(""),sol);
		return new ArrayList<>(sol);
    }
}

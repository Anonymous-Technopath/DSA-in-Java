/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Maximum Size Rectangle Sub-matrix With All 1's
*Problem Source : Coding Ninjas
* 
*/

import java.util.Scanner;
import java.util.Stack;

public class Maximum_Size_Rectangle_Sub_matrix_With_All_1s{
	public static void calcSubArray(int temp[],int add[][],int j,int m){
		for(int i=0;i<m;i++){
			temp[i]=mapper(temp[i],add[j][i]);
		}
	}
	public static int mapper(int temp,int add){
		if(add==0){
			return 0;
		}
		return temp+add;
	}
	public static int calcMax(int arr[]){
		int n=arr.length;
		int temp[]=new int[n];
		int max=0;
		Stack<Integer> s=new Stack<>();
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
				max=Math.max(max,((temp[s.peek()]-i-1)*arr[s.pop()]));
			}
            s.push(i);
		}
		while(!s.isEmpty()){
			max=Math.max(max,((temp[s.peek()])*arr[s.pop()]));
		}
		return max;
	}
	public static int maximalAreaOfSubMatrixOfAll1(int[][] mat, int n, int m) {
		// Write your code here.
		int max=0;
		int temp[]=new int[m];
		for(int i=0;i<n;i++){
			calcSubArray(temp, mat,i,m);
			max=Math.max(max,calcMax(temp));
		}
		return max;
	}
}
